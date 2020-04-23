/*

 * Mon Apr 20 12:19:52 UTC 2020
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
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEntityReferenceResolver_ESTest extends AbstractEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.WIKI;
      EntityType entityType1 = EntityType.BLOCK;
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      defaultSymbolScheme0.initialize();
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      EntityType entityType2 = EntityType.DOCUMENT;
      DefaultReferenceEntityReferenceResolver defaultReferenceEntityReferenceResolver0 = new DefaultReferenceEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      Injector.validateBean(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class);
      EntityType entityType3 = EntityType.DOCUMENT;
      EntityReference entityReference0 = new EntityReference("tXG", entityType3);
      Object[] objectArray0 = new Object[6];
      objectArray0[4] = (Object) entityType0;
      objectArray0[1] = (Object) entityType3;
      objectArray0[2] = (Object) entityType2;
      objectArray0[4] = (Object) entityType1;
      Object object0 = new Object();
      objectArray0[5] = object0;
      EntityReference entityReference1 = new EntityReference(entityReference0);
      entityReference0.hasParent(entityReference1);
      EntityType entityType4 = EntityType.OBJECT;
      Object[] objectArray1 = new Object[3];
      objectArray1[0] = (Object) entityType4;
      objectArray1[1] = (Object) entityType4;
      objectArray1[2] = (Object) entityReferenceProvider1;
      EntityReference entityReference2 = new EntityReference(entityReference1);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      ExplicitReferenceEntityReferenceResolver explicitReferenceEntityReferenceResolver0 = new ExplicitReferenceEntityReferenceResolver();
      EntityType entityType5 = EntityType.DOCUMENT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolveDefaultReference(entityType5, objectArray0);
  }
}
