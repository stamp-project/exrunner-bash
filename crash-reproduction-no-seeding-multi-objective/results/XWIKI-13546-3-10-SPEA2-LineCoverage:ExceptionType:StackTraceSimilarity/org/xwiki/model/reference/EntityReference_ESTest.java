/*

 * Mon Apr 20 13:54:51 UTC 2020
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
      EntityReference entityReference0 = new EntityReference("*)ar", entityType0);
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      entityReference0.extractFirstReference(entityType1);
      String string0 = null;
      EntityType entityType2 = EntityType.DOCUMENT;
      EntityReference entityReference1 = new EntityReference((String) null, entityType2);
  }
}
