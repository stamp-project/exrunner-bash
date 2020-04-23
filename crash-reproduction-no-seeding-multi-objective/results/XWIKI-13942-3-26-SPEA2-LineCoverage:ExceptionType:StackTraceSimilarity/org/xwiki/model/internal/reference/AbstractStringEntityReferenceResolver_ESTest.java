/*

 * Mon Apr 20 12:22:43 UTC 2020
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
      EntityType entityType0 = EntityType.OBJECT;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) "oK~b4N9`";
      Object object0 = new Object();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      relativeStringEntityReferenceResolver0.resolveDefaultReference(entityType1, objectArray0);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver1 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultSymbolScheme2.initialize();
      explicitStringEntityReferenceResolver1.initialize();
      EntityType entityType2 = EntityType.OBJECT_PROPERTY;
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      defaultSymbolScheme4.initialize();
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("wX<,{Gr=", entityType2, objectArray0);
  }
}
