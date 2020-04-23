/*

 * Mon Apr 20 11:50:07 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Class<Object> class1 = Object.class;
      classArray0[1] = class1;
      Class<Object> class2 = Object.class;
      classArray0[2] = class2;
      // Undeclared exception!
      ClassUtils.toClass(classArray0);
  }
}
