/*

 * Mon Apr 20 13:24:46 UTC 2020
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
      EntityType entityType0 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("BW", entityType0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Serializable> hashMap1 = new HashMap<String, Serializable>(hashMap0);
      entityReference0.setParameters(hashMap1);
      String string0 = "OBJECT_PROPERTY";
      entityReference0.setParameter("OBJECT_PROPERTY", entityType0);
      EntityReference entityReference1 = new EntityReference(entityReference0, (EntityReference) null);
      entityReference1.setName("OBJECT_PROPERTY");
      EntityType entityType1 = EntityType.SPACE;
      EntityReference entityReference2 = new EntityReference("BW", entityType1);
      EntityReference entityReference3 = new EntityReference("", entityType0, entityReference0, hashMap1);
  }
}
