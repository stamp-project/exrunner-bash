/*

 * Mon Apr 20 14:06:32 UTC 2020
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
      EntityReference entityReference0 = new EntityReference("=Xf.YYs!B'#", entityType0);
      EntityReference entityReference1 = entityReference0.extractFirstReference(entityType0);
      entityReference0.hasParent(entityReference1);
      EntityReference entityReference2 = new EntityReference("OBJECT_PROPERTY", entityType0);
      EntityReference entityReference3 = entityReference0.appendParent(entityReference1);
      Object object0 = new Object();
      EntityReference entityReference4 = new EntityReference(entityReference2);
      entityReference4.toString();
      entityReference3.size();
      EntityReference entityReference5 = new EntityReference("=Xf.YYs!B'#", entityType0);
      EntityReference entityReference6 = new EntityReference("", entityType0);
  }
}
