/*

 * Tue Apr 21 07:13:32 UTC 2020
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
      short short0 = (short) (-398);
      double[] doubleArray0 = new double[6];
      doubleArray0[3] = (double) (short) (-398);
      doubleArray0[3] = (double) (short) (-398);
      doubleArray0[4] = (double) (short) (-398);
      doubleArray0[5] = (double) (short) (-398);
      NumberUtils.isDigits(" is not a vald number.");
      String string0 = "h-Je0_oT{IGaE<g";
      // Undeclared exception!
      NumberUtils.createNumber("h-Je0_oT{IGaE<g");
  }
}
