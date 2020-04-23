/*

 * Mon Apr 20 12:18:41 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      EntityType entityType0 = EntityType.WIKI;
      EntityType entityType1 = EntityType.ATTACHMENT;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType2 = EntityType.ATTACHMENT;
      EntityType entityType3 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) explicitStringEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) entityType2;
      objectArray0[3] = (Object) entityType0;
      objectArray0[4] = (Object) entityType2;
      objectArray0[5] = (Object) entityType1;
      objectArray0[6] = (Object) defaultStringEntityReferenceResolver0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("Locale must not be null", entityType3, objectArray0);
  }
}
