/*

 * Mon Apr 20 12:19:02 UTC 2020
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
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Object object0 = new Object();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      EntityType entityType2 = EntityType.BLOCK;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = object0;
      objectArray0[1] = (Object) defaultSymbolScheme2;
      objectArray0[2] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[3] = object0;
      objectArray0[4] = (Object) entityType0;
      objectArray0[5] = (Object) entityType2;
      objectArray0[7] = (Object) entityReferenceProvider0;
      objectArray0[8] = (Object) defaultSymbolScheme1;
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null).when(entityReferenceProvider1).getDefaultReference(any(org.xwiki.model.EntityType.class));
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme3);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      EntityType entityType3 = EntityType.ATTACHMENT;
      defaultStringEntityReferenceResolver0.getDefaultReference(entityType3, objectArray0);
      EntityType entityType4 = EntityType.CLASS_PROPERTY;
      Object[] objectArray1 = new Object[5];
      objectArray1[0] = (Object) defaultSymbolScheme2;
      objectArray1[1] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[2] = object0;
      objectArray1[3] = (Object) entityType1;
      Object object1 = new Object();
      objectArray1[4] = object1;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("Aa@8zY;DMakRUyD1O7)", entityType4, objectArray1);
  }
}
