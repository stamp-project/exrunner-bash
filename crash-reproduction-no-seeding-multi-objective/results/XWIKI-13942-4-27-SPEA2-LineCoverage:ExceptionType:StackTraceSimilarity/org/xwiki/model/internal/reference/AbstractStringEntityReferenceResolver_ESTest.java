/*

 * Mon Apr 20 12:23:09 UTC 2020
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
      doReturn("PFYc6t=<", "PFYc6t=<").when(symbolScheme0).toString();
      doReturn(character0).when(symbolScheme0).getEscapeSymbol();
      doReturn(map0).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) explicitStringEntityReferenceResolver0;
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.getEscapeSymbol();
      Character character1 = new Character('~');
      Character.valueOf('~');
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType0 = EntityType.OBJECT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType0, objectArray0);
  }
}
