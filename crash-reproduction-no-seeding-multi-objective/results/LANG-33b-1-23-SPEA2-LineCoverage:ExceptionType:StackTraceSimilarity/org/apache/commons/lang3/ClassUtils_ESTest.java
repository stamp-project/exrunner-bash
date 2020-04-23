/*

 * Mon Apr 20 11:50:50 UTC 2020
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
      LinkedList<Class<Integer>> linkedList0 = new LinkedList<Class<Integer>>();
      Class<Integer> class0 = Integer.class;
      ClassUtils.isAssignable(class0, class0, true);
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 8);
      Class<Short> class1 = Short.class;
      classArray0[0] = class1;
      Class<Short> class2 = Short.class;
      classArray0[1] = class2;
      Class<Short> class3 = Short.class;
      classArray0[2] = class3;
      Object object0 = new Object();
      // Undeclared exception!
      ClassUtils.toClass(classArray0);
  }
}
