/*

 * Mon Apr 20 12:21:30 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      defaultSymbolScheme0.initialize();
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.BLOCK;
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = (Object) entityType1;
      objectArray1[1] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[2] = (Object) defaultSymbolScheme0;
      objectArray1[3] = (Object) entityType1;
      objectArray1[4] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[5] = (Object) "V_/'i}<0fFFO";
      objectArray1[6] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[7] = (Object) entityType0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("V_/'i}<0fFFO", entityType1, objectArray1);
  }
}
