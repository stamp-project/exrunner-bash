/*

 * Mon Apr 20 12:21:46 UTC 2020
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
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      defaultSymbolScheme0.initialize();
      objectArray0[1] = (Object) "#X.Zu}'Bl0";
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme0.initialize();
      objectArray0[3] = (Object) defaultSymbolScheme0;
      objectArray0[5] = (Object) "#X.Zu}'Bl0";
      objectArray0[7] = (Object) symbolScheme0;
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      defaultSymbolScheme1.initialize();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      defaultSymbolScheme2.initialize();
      defaultSymbolScheme2.initialize();
      defaultSymbolScheme2.initialize();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver1 = new ExplicitStringEntityReferenceResolver();
      explicitStringEntityReferenceResolver1.getSymbolScheme();
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType0, objectArray0);
  }
}
