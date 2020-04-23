/*

 * Mon Apr 20 13:59:02 UTC 2020
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
      EntityType entityType0 = EntityType.SPACE;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("Cloned reference must not be null", entityType1);
      EntityReference entityReference1 = new EntityReference("Cloned reference must not be null", entityType0);
      entityReference1.getName();
      EntityType entityType2 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference2 = new EntityReference("Cloned reference must not be null", entityType2, entityReference1);
      String string0 = "";
      EntityType entityType3 = EntityType.DOCUMENT;
      EntityReference entityReference3 = new EntityReference("", entityType3);
  }
}
