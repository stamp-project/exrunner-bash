/*

 * Tue Apr 21 08:37:19 UTC 2020
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
      doubleArray0[0] = (-320.67);
      MathArrays.checkOrder(doubleArray0);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      // Undeclared exception!
      MathArrays.linearCombination(doubleArray1, doubleArray1);
  }
}
