/*

 * Tue Apr 21 05:46:10 UTC 2020
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
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference0 = new EntityReference("ATTACHMENT", entityType1);
      EntityType entityType2 = EntityType.OBJECT_PROPERTY;
      EntityReference entityReference1 = new EntityReference("Aborting to protect against StackOverflowError - output of one loop is the input of another", entityType2, entityReference0);
      entityReference0.equalsNonRecursive(entityReference1);
      HashMap<String, Serializable> hashMap0 = new HashMap<String, Serializable>();
      entityReference0.setParameters(hashMap0);
      // Undeclared exception!
      entityReference0.setName("");
  }
}
