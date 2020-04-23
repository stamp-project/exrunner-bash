/*

 * Mon Apr 20 13:39:04 UTC 2020
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
      String string0 = "UY#>*V";
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("4/|^lPasqWjY%k);", entityType1, (EntityReference) null);
      EntityReference entityReference1 = new EntityReference("", entityType0, (EntityReference) null);
  }
}
