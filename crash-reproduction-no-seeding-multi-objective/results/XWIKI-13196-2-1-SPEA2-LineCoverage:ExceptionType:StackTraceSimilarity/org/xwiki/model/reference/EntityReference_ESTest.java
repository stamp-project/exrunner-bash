/*

 * Tue Apr 21 05:38:04 UTC 2020
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
      String string0 = "q.Hzb|i.oiBR*Yj\\d";
      EntityType entityType0 = EntityType.WIKI;
      String string1 = "8j=nm";
      EntityReference entityReference0 = null;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference1 = new EntityReference("8j=nm", entityType1, (EntityReference) null);
      String string2 = null;
      EntityReference entityReference2 = new EntityReference(entityReference1);
      entityReference1.replaceParent((EntityReference) null, entityReference2);
      EntityReference entityReference3 = new EntityReference((String) null, entityType0, entityReference1);
  }
}
