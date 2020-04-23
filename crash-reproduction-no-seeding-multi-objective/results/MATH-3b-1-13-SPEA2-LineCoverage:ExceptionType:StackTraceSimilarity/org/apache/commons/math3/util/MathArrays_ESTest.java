/*

 * Tue Apr 21 08:36:58 UTC 2020
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MathArrays_ESTest extends MathArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1494);
      intArray0[1] = 40;
      intArray0[2] = 2144952237;
      intArray0[3] = 355;
      intArray0[4] = 11;
      intArray0[5] = 5069;
      intArray0[6] = Integer.MAX_VALUE;
      intArray0[7] = (-1594);
      MathArrays.distance(intArray0, intArray0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-20.0);
      // Undeclared exception!
      MathArrays.linearCombination(doubleArray0, doubleArray0);
  }
}
