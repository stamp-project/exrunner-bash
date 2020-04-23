/*

 * Mon Apr 20 13:25:36 UTC 2020
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
      String string0 = "";
      EntityType entityType0 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("] in a document reference", entityType0);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      EntityReference entityReference1 = new EntityReference("e$:zF&m%yE1*M", entityType0, entityReference0, hashMap0);
      EntityReference entityReference2 = new EntityReference(entityReference1);
      entityReference2.getName();
      EntityType entityType1 = EntityType.OBJECT;
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityReference entityReference3 = new EntityReference("", entityType2);
  }
}
