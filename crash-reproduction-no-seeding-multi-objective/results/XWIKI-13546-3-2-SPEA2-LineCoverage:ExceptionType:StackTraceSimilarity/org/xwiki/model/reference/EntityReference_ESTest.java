/*

 * Mon Apr 20 13:44:35 UTC 2020
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
      String string0 = "~;d2`m8LmFi5";
      EntityType entityType0 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("~;d2`m8LmFi5", entityType0);
      EntityReference entityReference1 = new EntityReference("", entityType0);
  }
}
