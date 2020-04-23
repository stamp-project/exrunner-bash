/*

 * Tue Apr 21 06:00:26 UTC 2020
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
      EntityType entityType0 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("dylyqQ[K5=?vuea", entityType0);
      EntityType entityType1 = EntityType.SPACE;
      EntityReference entityReference1 = new EntityReference("dylyqQ[K5=?vuea", entityType1, (EntityReference) null);
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference2 = new EntityReference("\"BW0JuD;`Dr*K!TY/o", entityType2, entityReference0);
      entityReference1.getRoot();
      EntityType entityType3 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference3 = new EntityReference("", entityType3, (EntityReference) null);
  }
}
