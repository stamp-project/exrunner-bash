/*

 * Mon Apr 20 11:50:45 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Double> class0 = Double.class;
      ClassUtils.getAllSuperclasses(class0);
      ClassUtils.getPackageName(class0);
      ClassUtils.isInnerClass(class0);
      Class<Character> class1 = Character.class;
      ClassUtils.primitiveToWrapper(class1);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = (Object) "java.lang";
      Character.valueOf('.');
      Byte byte0 = new Byte((byte) (-66));
      String string0 = "double";
      ClassUtils.getPackageCanonicalName((Object) byte0, "double");
      Class<Character> class2 = Character.class;
      ClassUtils.getPackageCanonicalName(class2);
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}
