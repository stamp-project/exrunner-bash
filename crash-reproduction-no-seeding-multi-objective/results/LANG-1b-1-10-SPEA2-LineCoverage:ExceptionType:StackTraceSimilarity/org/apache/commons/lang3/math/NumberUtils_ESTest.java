/*

 * Tue Apr 21 06:59:52 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[0] = (-952L);
      longArray0[1] = 4536L;
      longArray0[2] = (-164L);
      NumberUtils.min(longArray0);
      // Undeclared exception!
      NumberUtils.createInteger("Array cannot be empty.");
  }
}
