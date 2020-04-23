/*

 * Mon Apr 20 13:57:07 UTC 2020
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
      String string0 = "The old reference [";
      EntityType entityType0 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("The old reference [", entityType0);
      entityReference0.equals((Object) entityType0);
      String string1 = "";
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference1 = new EntityReference("", entityType1);
  }
}
