/*

 * Mon Apr 20 13:45:32 UTC 2020
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
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference("l4l", entityType1);
      EntityReference entityReference1 = new EntityReference(entityReference0, entityReference0);
      EntityReference entityReference2 = new EntityReference("l4l", entityType0, entityReference1);
      entityReference2.equalsNonRecursive(entityReference0);
      entityReference0.size();
      EntityReference entityReference3 = new EntityReference(entityReference1);
      entityReference3.compareTo(entityReference0);
      EntityReference entityReference4 = new EntityReference(entityReference1, entityReference0, entityReference1);
      EntityReference entityReference5 = entityReference4.getParent();
      entityReference5.hasParent(entityReference4);
      EntityReference entityReference6 = new EntityReference("l4l", entityType0, entityReference2);
      entityReference0.equals(entityReference4, entityType0);
      EntityReference entityReference7 = entityReference1.appendParent(entityReference2);
      entityReference6.equals(entityReference2, entityType0);
      // Undeclared exception!
      entityReference7.setName("");
  }
}
