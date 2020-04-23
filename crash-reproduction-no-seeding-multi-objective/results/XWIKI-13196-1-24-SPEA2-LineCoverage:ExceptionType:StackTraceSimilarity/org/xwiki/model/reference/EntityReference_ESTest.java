/*

 * Tue Apr 21 05:59:32 UTC 2020
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
      String string0 = "";
      EntityType entityType0 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("TrN*r9al[", entityType0);
      entityReference0.setName("TrN*r9al[");
      entityReference0.toString();
      EntityType entityType1 = EntityType.SPACE;
      EntityReference entityReference1 = new EntityReference("", entityType1);
  }
}
