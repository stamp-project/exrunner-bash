/*

 * Mon Apr 20 14:08:55 UTC 2020
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
      EntityType entityType0 = EntityType.SPACE;
      String string0 = "The old reference [";
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("\"s", entityType1);
      String string1 = "";
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference1 = new EntityReference("", entityType2);
  }
}
