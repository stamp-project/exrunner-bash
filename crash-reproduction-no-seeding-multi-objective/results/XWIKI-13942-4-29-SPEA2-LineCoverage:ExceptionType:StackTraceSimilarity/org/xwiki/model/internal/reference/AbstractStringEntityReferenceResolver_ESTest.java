/*

 * Mon Apr 20 12:23:54 UTC 2020
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
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme1.initialize();
      HashMap<Character, EntityType> hashMap0 = new HashMap<Character, EntityType>();
      defaultSymbolScheme0.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme2);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      DefaultSymbolScheme defaultSymbolScheme4 = new DefaultSymbolScheme();
      relativeStringEntityReferenceResolver0.getSymbolScheme();
      EntityType entityType0 = EntityType.OBJECT;
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      DefaultSymbolScheme defaultSymbolScheme5 = new DefaultSymbolScheme();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) defaultSymbolScheme5;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve((String) null, entityType0, objectArray0);
  }
}
