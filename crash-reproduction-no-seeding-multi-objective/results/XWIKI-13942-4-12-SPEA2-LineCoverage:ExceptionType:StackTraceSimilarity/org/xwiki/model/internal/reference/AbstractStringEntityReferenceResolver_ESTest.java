/*

 * Mon Apr 20 12:19:55 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
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
      SymbolScheme symbolScheme0 = mock(SymbolScheme.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Object object1 = new Object();
      EntityType entityType0 = EntityType.SPACE;
      String string0 = "C1mJ$=hx";
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) "C1mJ$=hx";
      objectArray0[2] = (Object) defaultSymbolScheme0;
      objectArray0[3] = (Object) defaultSymbolScheme0;
      defaultSymbolScheme0.initialize();
      objectArray0[6] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[7] = (Object) defaultSymbolScheme1;
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      HashMap<Character, EntityType> hashMap0 = new HashMap<Character, EntityType>();
      explicitStringEntityReferenceResolver0.initialize();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme1);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultSymbolScheme2.initialize();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      relativeStringEntityReferenceResolver0.resolve("C1mJ$=hx", entityType0, objectArray0);
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      relativeStringEntityReferenceResolver0.getDefaultReference(entityType1, objectArray0);
      EntityType entityType2 = EntityType.OBJECT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("C1mJ$=hx", entityType2, objectArray0);
  }
}
