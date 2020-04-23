/*

 * Mon Apr 20 12:20:28 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultReferenceEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitReferenceEntityReferenceResolver;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitReferenceEntityReferenceResolver explicitReferenceEntityReferenceResolver0 = new ExplicitReferenceEntityReferenceResolver();
      Object object0 = new Object();
      Object object1 = new Object();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      defaultSymbolScheme0.initialize();
      SymbolScheme symbolScheme0 = defaultStringEntityReferenceResolver0.getSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[4];
      defaultSymbolScheme0.initialize();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultStringEntityReferenceResolver0.getSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.SPACE;
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType2, objectArray0);
      DefaultReferenceEntityReferenceResolver defaultReferenceEntityReferenceResolver0 = new DefaultReferenceEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null).when(entityReferenceProvider1).getDefaultReference(any(org.xwiki.model.EntityType.class));
      Injector.inject(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      Injector.validateBean(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class);
      defaultReferenceEntityReferenceResolver0.getDefaultReference(entityType2, objectArray0);
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType0, objectArray0);
  }
}
