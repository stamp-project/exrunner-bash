/*

 * Tue Apr 21 05:49:56 UTC 2020
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
      String string0 = "";
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      String string1 = "=Ha3fuj";
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("=Ha3fuj", entityType2);
      EntityReference entityReference1 = entityReference0.appendParent(entityReference0);
      EntityReference entityReference2 = entityReference1.appendParent(entityReference0);
      entityReference0.setParent(entityReference2);
      entityReference2.setName("MRr5s");
      entityReference0.setType(entityType1);
      EntityReference entityReference3 = new EntityReference("", entityType0, entityReference2);
  }
}
