/*

 * Mon Apr 20 12:17:12 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.DefaultSymbolScheme;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      defaultSymbolScheme0.initialize();
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      defaultSymbolScheme0.initialize();
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[22];
      objectArray0[0] = (Object) entityType0;
      objectArray0[2] = (Object) entityType0;
      objectArray0[4] = (Object) defaultSymbolScheme0;
      Object object0 = new Object();
      objectArray0[5] = (Object) defaultSymbolScheme0;
      defaultSymbolScheme0.initialize();
      objectArray0[6] = (Object) defaultSymbolScheme0;
      objectArray0[8] = (Object) entityType0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve(")%zV/v&FcHda2z", entityType0, objectArray0);
  }
}
