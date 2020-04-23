/*

 * Mon Apr 20 12:20:21 UTC 2020
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
import org.xwiki.model.internal.reference.SymbolScheme;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      HashMap<EntityType, Map<EntityType, Character>> hashMap0 = new HashMap<EntityType, Map<EntityType, Character>>();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType0 = EntityType.DOCUMENT;
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) symbolScheme0;
      objectArray0[2] = (Object) entityType0;
      objectArray0[3] = (Object) entityType0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("=x4BtCoa:&TQ 5}(`", entityType1, objectArray0);
  }
}
