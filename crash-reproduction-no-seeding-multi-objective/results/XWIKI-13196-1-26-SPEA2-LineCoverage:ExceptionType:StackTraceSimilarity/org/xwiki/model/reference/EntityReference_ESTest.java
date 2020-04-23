/*

 * Tue Apr 21 06:01:14 UTC 2020
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
      String string0 = "An Entity Reference type cannot be null";
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      EntityType entityType1 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("An Entity Reference type cannot be null", entityType1);
      entityReference0.hasParent(entityReference0);
      entityReference0.getReversedReferenceChain();
      entityReference0.getParameters();
      entityReference0.hashCode();
      EntityReference entityReference1 = entityReference0.replaceParent(entityReference0, entityReference0);
      entityReference1.setName("An Entity Reference type cannot be null");
      entityReference1.size();
      entityReference0.extractFirstReference(entityType0);
      EntityReference entityReference2 = new EntityReference(entityReference0, entityReference0);
      entityReference0.replaceParent(entityReference2, entityReference2);
      String string1 = null;
      // Undeclared exception!
      entityReference1.setName((String) null);
  }
}
