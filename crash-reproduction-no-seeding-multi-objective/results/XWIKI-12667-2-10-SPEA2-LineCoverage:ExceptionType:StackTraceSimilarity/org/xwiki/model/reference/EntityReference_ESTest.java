/*

 * Mon Apr 20 13:21:32 UTC 2020
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
      String string0 = "ZSE|cb0";
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("ZSE|cb0", entityType2);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      EntityReference entityReference1 = new EntityReference("ZSE|cb0", entityType1, entityReference0, hashMap0);
      EntityReference entityReference2 = new EntityReference(entityReference1, entityReference0);
      EntityReference entityReference3 = new EntityReference(entityReference2, entityReference0, entityReference2);
      EntityReference entityReference4 = new EntityReference(entityReference3);
      EntityReference entityReference5 = new EntityReference("ZSE|cb0", entityType0, entityReference4);
      entityReference5.equals(entityReference2, entityType1);
      entityReference4.getParameter("ZSE|cb0");
      entityReference1.compareTo(entityReference5);
      String string1 = null;
      entityReference5.getParameter((String) null);
      entityReference0.getRoot();
      entityReference1.size();
      EntityReference entityReference6 = new EntityReference("", entityType0, entityReference0);
  }
}
