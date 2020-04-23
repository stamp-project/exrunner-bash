/*

 * Mon Apr 20 12:18:54 UTC 2020
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
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver(defaultSymbolScheme0);
      EntityType entityType0 = EntityType.BLOCK;
      EntityType entityType1 = EntityType.SPACE;
      EntityType entityType2 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) entityType0;
      relativeStringEntityReferenceResolver0.initialize();
      objectArray0[1] = (Object) defaultSymbolScheme0;
      objectArray0[2] = (Object) defaultSymbolScheme0;
      objectArray0[3] = (Object) defaultSymbolScheme0;
      objectArray0[4] = (Object) entityType1;
      Object object0 = new Object();
      objectArray0[5] = object0;
      relativeStringEntityReferenceResolver0.resolve("TKjx~R/b\"e=q/yie?)", entityType2, objectArray0);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType3 = EntityType.SPACE;
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) entityType3;
      objectArray1[1] = (Object) "";
      EntityType entityType4 = EntityType.OBJECT;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("`k*)*X%", entityType4, objectArray0);
  }
}
