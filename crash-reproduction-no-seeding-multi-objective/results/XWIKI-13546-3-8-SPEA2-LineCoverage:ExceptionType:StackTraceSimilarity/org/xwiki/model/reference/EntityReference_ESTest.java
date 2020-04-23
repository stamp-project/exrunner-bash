/*

 * Mon Apr 20 13:52:41 UTC 2020
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
      String string0 = "] does not belong to the parents chain of the reference [";
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference("] does not belong to the parents chain of the reference [", entityType0);
      String string1 = "`urRV`C-o;RT";
      entityReference0.setParameter("`urRV`C-o;RT", "`urRV`C-o;RT");
      String string2 = null;
      EntityType entityType1 = EntityType.OBJECT;
      EntityReference entityReference1 = new EntityReference((String) null, entityType1);
  }
}
