/*

 * Mon Apr 20 12:19:06 UTC 2020
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
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver1 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver1, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(defaultStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      defaultStringEntityReferenceResolver1.getSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) defaultSymbolScheme1;
      objectArray0[1] = (Object) defaultStringEntityReferenceResolver1;
      objectArray0[2] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[3] = (Object) entityReferenceProvider0;
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver2 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver2, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      Injector.inject(defaultStringEntityReferenceResolver2, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme3);
      Injector.validateBean(defaultStringEntityReferenceResolver2, (Class<?>) DefaultStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.ATTACHMENT;
      Object object0 = new Object();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme4);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      // Undeclared exception!
      explicitStringEntityReferenceResolver1.resolveDefaultReference(entityType0, objectArray0);
  }
}
