/*

 * Mon Apr 20 13:22:43 UTC 2020
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
      HashMap<String, EntityReference> hashMap0 = new HashMap<String, EntityReference>();
      HashMap<String, Serializable> hashMap1 = new HashMap<String, Serializable>(hashMap0);
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      String string0 = "x/ 4]l[/~@UzA4.X18";
      EntityReference entityReference0 = new EntityReference("x/ 4]l[/~@UzA4.X18", entityType0);
      EntityReference entityReference1 = new EntityReference((String) null, entityType0, entityReference0);
  }
}
