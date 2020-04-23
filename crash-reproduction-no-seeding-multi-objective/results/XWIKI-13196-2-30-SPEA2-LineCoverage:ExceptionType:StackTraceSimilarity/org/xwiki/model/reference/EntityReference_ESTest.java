/*

 * Tue Apr 21 06:04:55 UTC 2020
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
      String string0 = "s34\\h(\"TQZ\"AtCl-o";
      EntityType entityType0 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("s34h(\"TQZ\"AtCl-o", entityType0);
      EntityReference entityReference1 = new EntityReference(entityReference0);
      EntityReference entityReference2 = new EntityReference("s34h(\"TQZ\"AtCl-o", entityType0, entityReference1);
      EntityReference entityReference3 = new EntityReference(entityReference2, entityReference1);
      EntityReference entityReference4 = new EntityReference(entityReference3, entityReference0, entityReference0);
      entityReference1.setName("ATTACHMENT");
      entityReference0.getType();
      EntityType entityType1 = EntityType.ATTACHMENT;
      EntityReference entityReference5 = new EntityReference("", entityType1, entityReference2);
  }
}
