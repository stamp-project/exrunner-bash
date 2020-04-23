/*

 * Mon Apr 20 12:19:59 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
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
import org.xwiki.model.internal.reference.SymbolScheme;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      Character character0 = new Character('u');
      HashMap<EntityType, Map<EntityType, Character>> hashMap0 = new HashMap<EntityType, Map<EntityType, Character>>();
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      doReturn("", "%1YsG(ztah").when(symbolScheme0).toString();
      doReturn(character0).when(symbolScheme0).getEscapeSymbol();
      doReturn(hashMap0).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.OBJECT;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) defaultSymbolScheme0;
      objectArray0[1] = (Object) symbolScheme0;
      objectArray0[2] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[3] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[4] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[5] = (Object) entityType0;
      objectArray0[6] = (Object) relativeStringEntityReferenceResolver0;
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver1 = new RelativeStringEntityReferenceResolver();
      Injector.inject(relativeStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(relativeStringEntityReferenceResolver1, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      relativeStringEntityReferenceResolver0.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver1.initialize();
      EntityType entityType1 = EntityType.DOCUMENT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver1.resolve("I", entityType1, objectArray0);
  }
}
