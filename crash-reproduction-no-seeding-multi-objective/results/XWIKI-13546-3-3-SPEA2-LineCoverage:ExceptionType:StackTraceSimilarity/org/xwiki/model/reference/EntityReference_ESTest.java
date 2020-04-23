/*

 * Mon Apr 20 13:45:40 UTC 2020
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
      EntityType entityType0 = EntityType.WIKI;
      EntityReference entityReference0 = new EntityReference("o%|Nb}|&Fv?=kI\"", entityType0);
      entityReference0.equalsNonRecursive(entityReference0);
      EntityReference entityReference1 = new EntityReference(entityReference0);
      EntityReference entityReference2 = new EntityReference("}9L3cd>thD#]", entityType0);
      EntityType entityType1 = EntityType.BLOCK;
      EntityReference entityReference3 = new EntityReference("", entityType1);
  }
}
