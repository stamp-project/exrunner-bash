/*

 * Tue Apr 21 06:59:33 UTC 2020
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
      NumberUtils.max((short) (-2016), (short) (-2016), (short) (-2016));
      NumberUtils.isDigits("#fTb#/z8");
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (short) (-2016);
      doubleArray0[1] = (double) (short) (-2016);
      NumberUtils.min(doubleArray0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)28;
      NumberUtils.min(byteArray0);
      try { 
        NumberUtils.createNumber("#fTb#/z8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fTb#/z8\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
