/*

 * Mon Apr 20 12:17:29 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme1);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme3);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver1 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme2);
      DefaultSymbolScheme defaultSymbolScheme5 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme5);
      Injector.validateBean(relativeStringEntityReferenceResolver1, (Class<?>) RelativeStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.ATTACHMENT;
      relativeStringEntityReferenceResolver1.getDefaultReference(entityType0, (Object[]) null);
      EntityType entityType1 = EntityType.ATTACHMENT;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) defaultSymbolScheme4;
      objectArray0[1] = (Object) defaultSymbolScheme2;
      objectArray0[2] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[3] = (Object) entityReferenceProvider0;
      objectArray0[4] = (Object) defaultSymbolScheme0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("Hcbc}z=g", entityType1, objectArray0);
  }
}
