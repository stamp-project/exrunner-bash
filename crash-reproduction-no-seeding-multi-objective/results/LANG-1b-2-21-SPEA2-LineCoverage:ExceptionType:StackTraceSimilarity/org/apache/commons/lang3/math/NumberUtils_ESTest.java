/*

 * Tue Apr 21 07:00:35 UTC 2020
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 619.174;
      doubleArray0[1] = (-28.40063);
      doubleArray0[2] = (-1.0);
      doubleArray0[3] = (-86.0342518181);
      doubleArray0[4] = (-2493.6017046299);
      doubleArray0[5] = (-2037.7285009172);
      doubleArray0[6] = (-375.09);
      NumberUtils.min(doubleArray0);
      NumberUtils.min(2756, 0, 0);
      String string0 = "-0x";
      NumberUtils.toDouble("-0x");
      NumberUtils.min(1781.0F, 0.0F, (float) 0);
      try { 
        NumberUtils.createNumber("-0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
