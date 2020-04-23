/*

 * Tue Apr 21 10:11:44 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[6][0];
      double[] doubleArray1 = new double[11];
      doubleArray1[2] = 1617.9176;
      doubleArray1[3] = 1617.9176;
      double[] doubleArray2 = new double[6];
      doubleArray2[2] = 1617.9176;
      doubleArray2[4] = 1617.9176;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray3 = new double[2];
      doubleArray0[1] = doubleArray3;
      double[] doubleArray4 = new double[18];
      doubleArray4[0] = (-731.311);
      doubleArray4[2] = 1613.49275855;
      doubleArray4[3] = 1617.9176;
      doubleArray4[4] = 1617.9176;
      doubleArray4[5] = 1617.9176;
      doubleArray4[7] = 1613.49275855;
      doubleArray0[4] = doubleArray3;
      double[] doubleArray5 = new double[5];
      doubleArray5[0] = 1617.9176;
      doubleArray5[1] = 286.8;
      doubleArray5[2] = 1617.9176;
      doubleArray5[3] = 1617.9176;
      doubleArray5[4] = 1617.9176;
      doubleArray0[5] = doubleArray5;
      double[] doubleArray6 = new double[9];
      doubleArray6[4] = 0.0;
      doubleArray6[5] = 1617.9176;
      MultiDirectional multiDirectional0 = new MultiDirectional();
      int int0 = 3608;
      multiDirectional0.setMaxIterations((-1209));
      try { 
        multiDirectional0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,209) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
