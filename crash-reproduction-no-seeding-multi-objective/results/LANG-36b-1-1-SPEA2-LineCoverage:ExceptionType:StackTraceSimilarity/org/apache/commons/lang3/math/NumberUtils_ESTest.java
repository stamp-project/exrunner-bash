/*

 * Tue Apr 21 07:18:36 UTC 2020
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1570.7350959901628);
      doubleArray0[1] = 3289.4;
      NumberUtils.min(doubleArray0);
      long[] longArray0 = new long[2];
      longArray0[0] = (-1L);
      longArray0[1] = (-588L);
      NumberUtils.min(longArray0);
      try { 
        NumberUtils.createNumber("DMjT");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // DMjT is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
