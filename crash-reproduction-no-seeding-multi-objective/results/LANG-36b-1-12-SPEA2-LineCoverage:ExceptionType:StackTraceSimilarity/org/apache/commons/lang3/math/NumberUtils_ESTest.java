/*

 * Tue Apr 21 07:18:46 UTC 2020
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
      NumberUtils.min((-764.690153), (-764.690153), (-764.690153));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-764.690153);
      Float float0 = NumberUtils.FLOAT_ONE;
      NumberUtils.max(1164, 8192, 2);
      float[] floatArray0 = new float[1];
      NumberUtils.max(floatArray0);
      NumberUtils.toByte((String) null);
      NumberUtils.min(floatArray0);
      NumberUtils.min((long) 8192, (long) 8192, 2906L);
      NumberUtils.max(doubleArray0);
      NumberUtils.toLong("ABS9QtM;vu[u4");
      try { 
        NumberUtils.createNumber("Dt*'{Ni6N");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Dt*'{Ni6N is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
