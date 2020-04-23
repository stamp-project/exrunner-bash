/*

 * Tue Apr 21 06:50:04 UTC 2020
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
      NumberUtils.toInt("=C6`?MU0N)LD%`{kUN", 5);
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)64;
      byte byte1 = (byte) (-43);
      byteArray0[2] = (byte) (-43);
      byte byte2 = (byte) (-48);
      byteArray0[3] = (byte) (-48);
      byteArray0[4] = (byte) (-89);
      byte byte3 = (byte)56;
      byteArray0[5] = (byte)56;
      NumberUtils.max(byteArray0);
      int[] intArray0 = new int[5];
      intArray0[0] = (int) (byte)56;
      intArray0[1] = (int) (byte) (-48);
      long long0 = 2204L;
      NumberUtils.max((long) 5, (long) (byte)64, 2204L);
      long long1 = 1202L;
      NumberUtils.toLong("=C6`?MU0N)LD%`{kUN", 1202L);
      NumberUtils.min(1L, 1202L, 2204L);
      try { 
        NumberUtils.createNumber("\"SJgK@fDwd7?@)%D-oZ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"SJgK@fDwd7?@)%D-oZ is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
