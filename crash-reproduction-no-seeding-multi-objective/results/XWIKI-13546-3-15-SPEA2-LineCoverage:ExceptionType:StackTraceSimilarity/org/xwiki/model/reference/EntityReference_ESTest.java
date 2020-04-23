/*

 * Mon Apr 20 14:01:21 UTC 2020
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
      String string0 = "~hapc{T";
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference("WTQS~}q=r_[q,uM m8T", entityType0);
      String string1 = null;
      EntityType entityType1 = EntityType.SPACE;
      EntityType entityType2 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference1 = new EntityReference((String) null, entityType2);
  }
}
