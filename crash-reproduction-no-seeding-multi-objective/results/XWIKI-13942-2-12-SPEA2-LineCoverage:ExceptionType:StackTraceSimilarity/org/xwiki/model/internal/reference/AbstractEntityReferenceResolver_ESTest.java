/*

 * Mon Apr 20 12:19:33 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      EntityType entityType0 = EntityType.WIKI;
      Object[] objectArray0 = new Object[2];
      EntityType entityType1 = EntityType.WIKI;
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[1] = (Object) explicitStringEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray1[2] = object0;
      objectArray1[3] = (Object) entityType0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType1, objectArray1);
  }
}
