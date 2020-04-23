/*

 * Mon Apr 20 12:22:44 UTC 2020
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
      explicitStringEntityReferenceResolver0.getSymbolScheme();
      Character character0 = Character.valueOf('?');
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Map<EntityType, Map<EntityType, Character>> map0 = defaultSymbolScheme0.getSeparatorSymbols();
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(symbolScheme0).toString();
      doReturn(character0, (Character) null).when(symbolScheme0).getEscapeSymbol();
      doReturn(map0).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "|I";
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = (Object) "|I";
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("|I", entityType0, objectArray0);
  }
}
