/*

 * Mon Apr 20 12:25:20 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
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
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      defaultSymbolScheme0.initialize();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      EntityType entityType1 = EntityType.WIKI;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.getSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType2 = EntityType.DOCUMENT;
      EntityType entityType3 = EntityType.WIKI;
      Map<Character, EntityType> map0 = explicitStringEntityReferenceResolver0.getTypeSetup(entityType3);
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) relativeStringEntityReferenceResolver0;
      objectArray0[1] = (Object) entityType2;
      objectArray0[2] = (Object) defaultSymbolScheme1;
      objectArray0[3] = (Object) entityType2;
      objectArray0[4] = (Object) entityType1;
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType0, objectArray0);
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null).when(entityReferenceProvider0).getDefaultReference(any(org.xwiki.model.EntityType.class));
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) map0;
      defaultStringEntityReferenceResolver0.getDefaultReference(entityType3, objectArray1);
      EntityType entityType4 = EntityType.SPACE;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType4, objectArray1);
  }
}
