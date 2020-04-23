/*

 * Mon Apr 20 11:50:53 UTC 2020
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
      ClassUtils.getPackageName("|K}h,+UvK\"?sl/j[= %");
      Class<Double> class0 = Double.TYPE;
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) "";
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}
