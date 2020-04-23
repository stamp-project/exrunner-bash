/*

 * Tue Apr 21 08:36:50 UTC 2020
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 6.283185307179586;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true);
      MathArrays.linearCombination(6.283185307179586, 0.0, 6.283185307179586, 0.0, 0.0, 290.8137, 2581.066461998, (-1722.481992770532));
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = (-1693);
      intArray0[4] = (-384);
      intArray0[5] = 1839;
      MathArrays.distance1(intArray0, intArray0);
      // Undeclared exception!
      MathArrays.linearCombination(doubleArray0, doubleArray0);
  }
}
