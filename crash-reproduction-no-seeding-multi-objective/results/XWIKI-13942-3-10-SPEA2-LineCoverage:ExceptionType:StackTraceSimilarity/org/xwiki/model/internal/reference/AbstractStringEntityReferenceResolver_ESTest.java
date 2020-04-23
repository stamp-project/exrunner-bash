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
      String string0 = "Minimum abbreviation width is 4";
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      defaultSymbolScheme0.initialize();
      defaultSymbolScheme0.initialize();
      EntityType entityType0 = EntityType.OBJECT;
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      defaultSymbolScheme1.initialize();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      DefaultSymbolScheme defaultSymbolScheme2 = new DefaultSymbolScheme();
      EntityType entityType1 = EntityType.ATTACHMENT;
      EntityType entityType2 = EntityType.ATTACHMENT;
      DefaultSymbolScheme defaultSymbolScheme3 = new DefaultSymbolScheme();
      EntityType entityType3 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = null;
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) entityType2;
      objectArray1[1] = (Object) entityType0;
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("", entityType1, objectArray1);
  }
}
