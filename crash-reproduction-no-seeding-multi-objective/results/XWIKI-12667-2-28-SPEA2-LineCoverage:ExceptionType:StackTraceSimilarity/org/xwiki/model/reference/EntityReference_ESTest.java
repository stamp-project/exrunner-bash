/*

 * Mon Apr 20 13:40:04 UTC 2020
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
      EntityType entityType1 = EntityType.OBJECT;
      EntityType entityType2 = EntityType.SPACE;
      EntityReference entityReference0 = new EntityReference("ATTACHMENT", entityType2);
      entityReference0.getReversedReferenceChain();
      entityReference0.compareTo(entityReference0);
      entityReference0.setParameter("kk", 0);
      EntityType entityType3 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference1 = new EntityReference("", entityType3, entityReference0);
  }
}
