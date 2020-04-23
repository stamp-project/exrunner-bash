/*

 * Mon Apr 20 11:49:39 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 1);
      ClassUtils.isAssignable(classArray0, classArray0, true);
      Class<String> class0 = String.class;
      Class<Float> class1 = Float.class;
      boolean boolean0 = true;
      ClassUtils.isAssignable(class0, class1, true);
      LinkedList<Class<Boolean>> linkedList0 = new LinkedList<Class<Boolean>>();
      ClassUtils.primitivesToWrappers(classArray0);
      Class<Long> class2 = Long.class;
      Class<Double> class3 = Double.class;
      ClassUtils.isAssignable(class2, class3);
      // Undeclared exception!
      ClassUtils.toClass(classArray0);
  }
}
