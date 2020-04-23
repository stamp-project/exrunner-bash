/*

 * Mon Apr 20 12:21:53 UTC 2020
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
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Object object0 = new Object();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      relativeStringEntityReferenceResolver0.initialize();
      relativeStringEntityReferenceResolver0.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.OBJECT;
      relativeStringEntityReferenceResolver0.getTypeSetup(entityType0);
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      relativeStringEntityReferenceResolver0.getTypeSetup(entityType1);
      explicitStringEntityReferenceResolver0.initialize();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) defaultSymbolScheme2;
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType0, objectArray0);
      EntityType entityType2 = EntityType.DOCUMENT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType2, objectArray0);
  }
}
