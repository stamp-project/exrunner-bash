/*

 * Mon Apr 20 13:51:10 UTC 2020
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
      String string0 = "^?%#]l::.-%CPL19&e";
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      EntityReference entityReference0 = new EntityReference("^?%#]l::.-%CPL19&e", entityType0);
      entityReference0.getName();
      EntityReference entityReference1 = null;
      entityReference0.size();
      EntityReference entityReference2 = new EntityReference(entityReference0, entityReference0);
      entityReference0.hashCode();
      entityReference2.setParent(entityReference0);
      EntityReference entityReference3 = new EntityReference(entityReference2);
      entityReference2.getParameters();
      // Undeclared exception!
      entityReference2.setName("");
  }
}
