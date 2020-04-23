/*

 * Mon Apr 20 12:19:16 UTC 2020
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
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[7];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) entityType0;
      objectArray0[2] = (Object) entityType0;
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) explicitStringEntityReferenceResolver0;
      objectArray0[5] = (Object) entityType0;
      objectArray0[6] = (Object) "";
      explicitStringEntityReferenceResolver0.initialize();
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("V#", entityType0, objectArray0);
  }
}
