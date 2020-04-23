/*

 * Tue Apr 21 06:49:28 UTC 2020
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
      byte byte0 = (byte) (-120);
      byte byte1 = (byte)0;
      NumberUtils.min((byte) (-120), (byte)0, (byte)0);
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) (byte) (-120);
      floatArray0[1] = (-3711.5F);
      floatArray0[2] = (float) (byte)0;
      floatArray0[3] = (float) (byte)0;
      floatArray0[4] = (float) (byte) (-120);
      NumberUtils.max(floatArray0);
      NumberUtils.min(floatArray0);
      try { 
        NumberUtils.createNumber("^&=8[UR7JkG>m");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ^&=8[UR7JkG>m is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
