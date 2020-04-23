/*

 * Mon Apr 20 13:56:49 UTC 2020
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
      EntityReference entityReference0 = new EntityReference("WIKI", entityType0);
      entityReference0.equals((EntityReference) null, entityType0, entityType0);
      EntityReference entityReference1 = entityReference0.removeParent((EntityReference) null);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      entityReference1.equals((EntityReference) null, entityType0, entityType1);
      EntityReference entityReference2 = entityReference0.replaceParent((EntityReference) null, entityReference1);
      entityReference2.setType(entityType0);
      entityReference0.replaceParent((EntityReference) null, entityReference1);
      String string0 = null;
      EntityReference entityReference3 = new EntityReference((String) null, entityType1);
  }
}
