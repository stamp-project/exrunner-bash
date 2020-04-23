/*

 * Mon Apr 20 12:17:37 UTC 2020
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
      String string0 = "";
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Character character0 = defaultSymbolScheme0.getEscapeSymbol();
      Map<EntityType, Map<EntityType, Character>> map0 = defaultSymbolScheme0.getSeparatorSymbols();
      Character character1 = Character.valueOf('e');
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Character character2 = defaultSymbolScheme1.getEscapeSymbol();
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      doReturn("", "ebO,w,_On]6", "VO\"A-", "[^Ct@HF-bhE4vl*W8", "upper bound for wildcard").when(symbolScheme0).toString();
      doReturn(character0, character0, character1, character2, character1).when(symbolScheme0).getEscapeSymbol();
      doReturn(map0).when(symbolScheme0).getSeparatorSymbols();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) symbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      String string1 = "{MrDB5>%";
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("{MrDB5>%", entityType0, objectArray0);
  }
}
