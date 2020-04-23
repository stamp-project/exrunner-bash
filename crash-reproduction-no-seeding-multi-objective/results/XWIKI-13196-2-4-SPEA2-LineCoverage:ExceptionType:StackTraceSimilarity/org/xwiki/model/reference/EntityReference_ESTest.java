/*

 * Tue Apr 21 05:40:34 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EntityReference_ESTest extends EntityReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference0 = new EntityReference("]", entityType0);
      EntityType entityType1 = EntityType.OBJECT;
      EntityType entityType2 = EntityType.SPACE;
      HashMap<String, EntityReference> hashMap0 = new HashMap<String, EntityReference>();
      HashMap<String, Serializable> hashMap1 = new HashMap<String, Serializable>(hashMap0);
      EntityReference entityReference1 = new EntityReference(">nZ#NO0i0l^a2Z3Q", entityType2, entityReference0, hashMap1);
      EntityReference entityReference2 = new EntityReference("", entityType1, entityReference1);
  }
}
