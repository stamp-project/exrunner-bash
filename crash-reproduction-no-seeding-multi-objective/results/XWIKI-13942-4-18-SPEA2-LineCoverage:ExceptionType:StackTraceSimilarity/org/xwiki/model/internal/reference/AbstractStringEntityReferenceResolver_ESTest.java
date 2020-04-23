/*

 * Mon Apr 20 12:22:03 UTC 2020
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
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractStringEntityReferenceResolver_ESTest extends AbstractStringEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EntityType entityType0 = EntityType.SPACE;
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) entityType0;
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      explicitStringEntityReferenceResolver0.initialize();
      String string0 = ")CKjr{oBzWp|z,";
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) relativeStringEntityReferenceResolver0;
      objectArray1[1] = (Object) entityType1;
      objectArray1[2] = (Object) defaultSymbolScheme0;
      objectArray1[3] = (Object) defaultSymbolScheme1;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve(")CKjr{oBzWp|z,", entityType1, objectArray1);
  }
}
