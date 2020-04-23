/*

 * Tue Apr 21 05:51:50 UTC 2020
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
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference0 = new EntityReference("Y7NP]", entityType2);
      EntityReference entityReference1 = new EntityReference(entityReference0, entityReference0);
      EntityReference entityReference2 = new EntityReference("&FuYVn", entityType1, entityReference1);
      entityReference0.size();
      EntityType entityType3 = EntityType.ATTACHMENT;
      EntityReference entityReference3 = new EntityReference("?Kj", entityType3, entityReference1);
      EntityReference entityReference4 = new EntityReference("", entityType0, entityReference2);
  }
}
