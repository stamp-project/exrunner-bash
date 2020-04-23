/*

 * Mon Apr 20 14:07:25 UTC 2020
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
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.OBJECT;
      EntityType entityType2 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference0 = new EntityReference("]", entityType1);
      entityReference0.hasParent(entityReference0);
      entityReference0.compareTo(entityReference0);
      entityReference0.equals(entityReference0, entityType0);
      entityReference0.setName("0m*woF4-/IJ%\"");
      entityReference0.setName("'yV0OR)");
      entityReference0.setType(entityType1);
      EntityReference entityReference1 = new EntityReference((String) null, entityType2, entityReference0);
  }
}
