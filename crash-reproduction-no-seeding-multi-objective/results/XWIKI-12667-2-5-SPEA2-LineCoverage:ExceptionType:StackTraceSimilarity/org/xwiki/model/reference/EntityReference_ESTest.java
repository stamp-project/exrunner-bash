/*

 * Mon Apr 20 13:16:49 UTC 2020
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
      EntityReference entityReference0 = new EntityReference("DOCUMENT", entityType0);
      EntityReference entityReference1 = new EntityReference("An Entity Reference name cannot be null or empty", entityType0, entityReference0);
      entityReference1.getReversedReferenceChain();
      entityReference0.size();
      EntityReference entityReference2 = new EntityReference(entityReference0, entityReference0);
      String string0 = null;
      EntityReference entityReference3 = new EntityReference((String) null, entityType0, entityReference2);
  }
}
