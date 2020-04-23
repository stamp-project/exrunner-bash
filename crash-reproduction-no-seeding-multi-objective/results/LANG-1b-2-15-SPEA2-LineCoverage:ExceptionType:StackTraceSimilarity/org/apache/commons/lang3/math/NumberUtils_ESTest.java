/*

 * Tue Apr 21 07:00:14 UTC 2020
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
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-1084);
      intArray0[2] = 857;
      intArray0[3] = (-3493);
      intArray0[4] = 0;
      intArray0[5] = (-2286);
      intArray0[6] = 0;
      intArray0[7] = (-1);
      NumberUtils.max(intArray0);
      NumberUtils.toShort("0X", (short)0);
      NumberUtils.toShort("0X", (short)0);
      NumberUtils.min((-1.0F), (float) 857, (-1.0F));
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)20;
      NumberUtils.max(byteArray0);
      NumberUtils.toInt("0X");
      try { 
        NumberUtils.createNumber("0X");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
