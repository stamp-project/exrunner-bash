/*

 * Tue Apr 21 07:18:59 UTC 2020
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
      NumberUtils.toInt("=Z+x9n", 45);
      NumberUtils.max((byte)0, (byte)120, (byte)0);
      NumberUtils.toInt("0%`9\"FfyY@41)\" ,");
      long[] longArray0 = new long[2];
      longArray0[0] = (long) (byte)120;
      longArray0[1] = (long) 45;
      NumberUtils.min(longArray0);
      NumberUtils.max((double) (byte)120, (double) 45L, (-1.0));
      NumberUtils.min(0.0F, (float) (byte)120, 1894.3911F);
      NumberUtils.min((byte)120, (byte)120, (byte) (-21));
      NumberUtils.min((short)0, (short)0, (short)0);
      try { 
        NumberUtils.createNumber("=Z+x9n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // =Z+x9n is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
