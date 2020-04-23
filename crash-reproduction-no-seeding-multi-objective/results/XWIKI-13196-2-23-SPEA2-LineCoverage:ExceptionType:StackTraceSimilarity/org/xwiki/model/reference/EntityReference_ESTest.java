/*

 * Tue Apr 21 05:58:34 UTC 2020
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
      EntityType entityType0 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("q:]Rca1)E[,<Gv2[O", entityType0);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference1 = new EntityReference("BLOCK", entityType1, entityReference0);
      entityReference0.compareTo(entityReference1);
      EntityType entityType2 = EntityType.OBJECT;
      EntityReference entityReference2 = new EntityReference((String) null, entityType2, entityReference1);
  }
}
