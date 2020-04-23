/*

 * Mon Apr 20 14:04:47 UTC 2020
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
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference0 = null;
      EntityReference entityReference1 = new EntityReference("cco-[X3{ [y@U))93", entityType0, (EntityReference) null);
      entityReference1.getName();
      entityReference1.setType(entityType0);
      entityReference1.equals((Object) "cco-[X3{ [y@U))93");
      entityReference1.getType();
      entityReference1.getParameters();
      // Undeclared exception!
      entityReference1.setName("");
  }
}
