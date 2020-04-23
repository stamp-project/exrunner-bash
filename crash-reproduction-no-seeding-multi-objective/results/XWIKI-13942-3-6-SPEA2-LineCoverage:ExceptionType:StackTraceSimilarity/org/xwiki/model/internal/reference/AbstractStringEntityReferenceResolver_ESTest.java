/*

 * Mon Apr 20 12:18:16 UTC 2020
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
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      DefaultSymbolScheme defaultSymbolScheme0 = new DefaultSymbolScheme();
      defaultSymbolScheme0.initialize();
      Character.isSurrogate('X');
      EntityType entityType1 = EntityType.WIKI;
      EntityType entityType2 = EntityType.SPACE;
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      Injector.inject(relativeStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme0);
      Injector.validateBean(relativeStringEntityReferenceResolver0, (Class<?>) RelativeStringEntityReferenceResolver.class);
      EntityType entityType3 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) defaultSymbolScheme0;
      objectArray0[2] = (Object) entityType3;
      objectArray0[3] = (Object) entityType1;
      objectArray0[4] = (Object) "9:|7LiPi";
      objectArray0[5] = (Object) "9:|7LiPi";
      objectArray0[6] = (Object) "9:|7LiPi";
      relativeStringEntityReferenceResolver0.resolveDefaultReference(entityType3, objectArray0);
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      DefaultSymbolScheme defaultSymbolScheme1 = new DefaultSymbolScheme();
      Injector.inject(explicitStringEntityReferenceResolver0, (Class<?>) AbstractStringEntityReferenceResolver.class, "symbolScheme", (Object) defaultSymbolScheme1);
      Injector.validateBean(explicitStringEntityReferenceResolver0, (Class<?>) ExplicitStringEntityReferenceResolver.class);
      explicitStringEntityReferenceResolver0.initialize();
      EntityType entityType4 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) "";
      objectArray1[1] = (Object) "9:|7LiPi";
      objectArray1[2] = (Object) entityType2;
      objectArray1[3] = (Object) entityType4;
      objectArray1[5] = (Object) "9:|7LiPi";
      // Undeclared exception!
      explicitStringEntityReferenceResolver0.resolve("SPACE", entityType4, objectArray1);
  }
}
