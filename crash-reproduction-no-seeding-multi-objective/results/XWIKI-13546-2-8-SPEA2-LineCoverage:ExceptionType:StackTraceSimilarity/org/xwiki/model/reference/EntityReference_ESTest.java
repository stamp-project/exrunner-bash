/*

 * Mon Apr 20 13:52:28 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "DN|$";
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      EntityType entityType2 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("*L4d3?,&js", entityType2);
      Map<String, Serializable> map0 = entityReference0.getParameters();
      EntityReference entityReference1 = new EntityReference((String) null, entityType1, entityReference0, map0);
  }
}
