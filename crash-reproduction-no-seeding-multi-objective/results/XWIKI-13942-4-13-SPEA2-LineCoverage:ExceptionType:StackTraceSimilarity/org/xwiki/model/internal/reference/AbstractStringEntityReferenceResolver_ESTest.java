/*

 * Mon Apr 20 12:19:59 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
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
      defaultSymbolScheme0.getEscapeSymbol();
      HashMap<EntityType, Map<EntityType, Character>> hashMap0 = new HashMap<EntityType, Map<EntityType, Character>>();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver1.initialize();
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver1 = new RelativeStringEntityReferenceResolver();
      Injector.inject(relativeStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver1, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme5 = new DefaultSymbolScheme();
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "";
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType1, objectArray0);
      // Undeclared exception!
      explicitStringEntityReferenceResolver1.resolve("", entityType0, objectArray0);
  }
}
