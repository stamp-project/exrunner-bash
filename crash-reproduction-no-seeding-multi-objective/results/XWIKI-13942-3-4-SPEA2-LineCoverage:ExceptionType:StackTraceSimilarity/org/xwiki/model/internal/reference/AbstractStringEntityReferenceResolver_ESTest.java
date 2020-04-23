/*

 * Mon Apr 20 12:17:37 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      EntityType entityType0 = EntityType.OBJECT;
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      defaultSymbolScheme1.initialize();
      defaultSymbolScheme1.initialize();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Object object1 = new Object();
      Object object2 = new Object();
      defaultSymbolScheme0.initialize();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme1);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      String string0 = "\\uv%]";
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) defaultSymbolScheme2;
      objectArray0[1] = (Object) entityType0;
      objectArray0[2] = (Object) entityType1;
      objectArray0[3] = (Object) "M'1#aIL@0f.>.Wyva";
      objectArray0[4] = (Object) relativeStringEntityReferenceResolver0;
      objectArray0[5] = (Object) "Expected a Class, ParameterizedType, or GenericArrayType, but <";
      objectArray0[6] = (Object) "M'1#aIL@0f.>.Wyva";
      Object object3 = new Object();
      objectArray0[7] = object3;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve(string0, entityType1, objectArray0);
  }
}
