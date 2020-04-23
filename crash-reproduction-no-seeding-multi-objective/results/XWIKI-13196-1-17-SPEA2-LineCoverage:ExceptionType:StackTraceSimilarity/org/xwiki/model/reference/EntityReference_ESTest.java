/*

 * Tue Apr 21 05:52:36 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "~*c{<G*";
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = new EntityReference("f/OR=@y", entityType0);
      EntityReference entityReference1 = null;
      entityReference0.equalsNonRecursive((EntityReference) null);
      String string1 = "";
      EntityReference entityReference2 = new EntityReference("", entityType0, (EntityReference) null);
  }
}
