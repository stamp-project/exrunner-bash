/*

 * Mon Apr 20 12:23:04 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.SymbolScheme;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Character character0 = defaultSymbolScheme0.getEscapeSymbol();
      Map<EntityType, Map<EntityType, Character>> map0 = defaultSymbolScheme0.getSeparatorSymbols();
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      doReturn("Y^zuD8\"{_", "Y^zuD8\"{_", (String) null).when(symbolScheme0).toString();
      doReturn(character0).when(symbolScheme0).getEscapeSymbol();
      doReturn(map0, (Map) null).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Object object0 = new Object();
      EntityType entityType0 = EntityType.WIKI;
      Character.getName(30);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver1, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver1, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultSymbolScheme1.getEscapeSymbol();
      defaultSymbolScheme2.getSeparatorSymbols();
      Object object1 = new Object();
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.initialize();
  }
}
