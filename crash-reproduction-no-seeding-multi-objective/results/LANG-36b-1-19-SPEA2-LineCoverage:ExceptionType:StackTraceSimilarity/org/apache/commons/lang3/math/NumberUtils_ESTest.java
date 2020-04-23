/*

 * Tue Apr 21 07:18:50 UTC 2020
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-23);
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)65;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-49);
      byteArray0[6] = (byte)111;
      byteArray0[7] = (byte)76;
      NumberUtils.min(byteArray0);
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (byte)0;
      longArray0[1] = (long) (byte) (-23);
      longArray0[2] = (long) (byte)76;
      longArray0[3] = (long) (byte)18;
      longArray0[4] = (long) (byte)0;
      NumberUtils.max(longArray0);
      String string0 = "qyGMmtqdt\\a_zn5jA";
      NumberUtils.toDouble("qyGMmtqdta_zn5jA", (double) (byte) (-49));
      try { 
        NumberUtils.createNumber("qyGMmtqdta_zn5jA");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // qyGMmtqdta_zn5jA is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
