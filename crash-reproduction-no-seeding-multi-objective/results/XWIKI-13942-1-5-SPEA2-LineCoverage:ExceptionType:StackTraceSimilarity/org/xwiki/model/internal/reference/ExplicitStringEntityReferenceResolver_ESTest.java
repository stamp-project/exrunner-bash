/*

 * Mon Apr 20 12:17:33 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ExplicitStringEntityReferenceResolver_ESTest extends ExplicitStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      EntityType entityType0 = EntityType.OBJECT;
      Object[] objectArray0 = new Object[9];
      objectArray0[7] = (Object) entityType0;
      Object object0 = new Object();
      objectArray0[1] = (Object) symbolScheme0;
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[0] = (Object) entityType0;
      objectArray0[6] = (Object) entityType0;
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.CLASS_PROPERTY;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      SymbolScheme symbolScheme1 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType1, objectArray0);
  }
}
