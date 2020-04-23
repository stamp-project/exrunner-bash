/*

 * Tue Apr 21 05:57:20 UTC 2020
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
      String string0 = "EInJf::;%|>lGIX\"\"";
      EntityType entityType0 = EntityType.ATTACHMENT;
      String string1 = "WIKI";
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference0 = new EntityReference("WIKI", entityType1);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      EntityReference entityReference1 = new EntityReference("EInJf::;%|>lGIX\"\"", entityType0, entityReference0, hashMap0);
      entityReference1.toString();
      EntityType entityType2 = EntityType.WIKI;
      EntityReference entityReference2 = new EntityReference((String) null, entityType2, entityReference1);
  }
}
