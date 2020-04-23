/*

 * Tue Apr 21 07:18:39 UTC 2020
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
      doubleArray0[0] = (-1933.62);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1933.62);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-1.0);
      String string0 = "l\"4<W/,u(|OmvUI";
      try { 
        NumberUtils.createNumber("l\"4<W/,u(|OmvUI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // l\"4<W/,u(|OmvUI is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
