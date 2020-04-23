/*

 * Mon Apr 20 13:43:23 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
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
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      EntityType entityType2 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference0 = new EntityReference("v >]2'9w<~PU<5ys9)", entityType2);
      EntityReference entityReference1 = new EntityReference((String) null, entityType1);
  }
}
