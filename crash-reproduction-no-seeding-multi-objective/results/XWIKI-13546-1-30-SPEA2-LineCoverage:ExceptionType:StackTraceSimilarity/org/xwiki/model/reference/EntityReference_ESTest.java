/*

 * Mon Apr 20 14:20:13 UTC 2020
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
      String string0 = "^4u1\"FbXXgFg9GN:";
      EntityType entityType0 = EntityType.OBJECT;
      EntityReference entityReference0 = new EntityReference("^4u1\"FbXXgFg9GN:", entityType0);
      entityReference0.hashCode();
      entityReference0.equalsNonRecursive(entityReference0);
      entityReference0.setName("^4u1\"FbXXgFg9GN:");
      // Undeclared exception!
      entityReference0.setName("");
  }
}
