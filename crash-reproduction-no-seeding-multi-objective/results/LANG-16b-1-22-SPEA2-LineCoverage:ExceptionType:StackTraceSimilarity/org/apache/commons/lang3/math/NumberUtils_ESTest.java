/*

 * Tue Apr 21 06:50:12 UTC 2020
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)96;
      byteArray0[1] = (byte)96;
      byteArray0[3] = (byte)6;
      Byte byte0 = new Byte((byte)6);
      NumberUtils.toByte("O", (byte)6);
      Float float0 = new Float((float) (byte)36);
      Float float1 = new Float((float) (byte)6);
      short[] shortArray0 = new short[0];
      Byte byte1 = new Byte((byte)6);
      NumberUtils.min(byteArray0);
      Byte byte2 = new Byte((byte)96);
      NumberUtils.max((short)2821, (short)30, (short)55);
      NumberUtils.toInt("PSn2,68:p)P");
      Float float2 = NumberUtils.FLOAT_MINUS_ONE;
      NumberUtils.toLong("-0xAr}ay cannot be empty3");
      NumberUtils.toDouble((String) null);
      NumberUtils.toFloat(",/yu?!k$&s", (float) (byte)6);
      NumberUtils.createLong((String) null);
      NumberUtils.max(2690.08F, (float) (short)55, (float) (short)21);
      try { 
        NumberUtils.createNumber("PSn2,68:p)P");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // PSn2,68:p)P is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
