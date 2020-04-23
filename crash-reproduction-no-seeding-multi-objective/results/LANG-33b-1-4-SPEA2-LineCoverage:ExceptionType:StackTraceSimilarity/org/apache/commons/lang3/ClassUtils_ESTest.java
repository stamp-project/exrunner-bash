/*

 * Mon Apr 20 11:49:57 UTC 2020
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
      Long long0 = new Long(13L);
      String string0 = "bi~L^]F>$1#}?9IRY";
      ClassUtils.getShortClassName((Object) long0, "bi~L^]F>$1#}?9IRY");
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) long0;
      objectArray0[1] = (Object) "Long";
      objectArray0[2] = (Object) long0;
      objectArray0[3] = (Object) long0;
      objectArray0[4] = (Object) "Long";
      objectArray0[5] = (Object) long0;
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}
