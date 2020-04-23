/*

 * Mon Apr 20 14:10:07 UTC 2020
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
      String string0 = "HU}*$zzQ|hT=Wat";
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = new EntityReference("HU}*$zzQ|hT=Wat", entityType0);
      EntityReference entityReference1 = new EntityReference("HU}*$zzQ|hT=Wat", entityType0);
      EntityReference entityReference2 = new EntityReference(entityReference0, entityReference0);
      EntityType entityType1 = null;
      EntityReference entityReference3 = new EntityReference("", (EntityType) null);
  }
}
