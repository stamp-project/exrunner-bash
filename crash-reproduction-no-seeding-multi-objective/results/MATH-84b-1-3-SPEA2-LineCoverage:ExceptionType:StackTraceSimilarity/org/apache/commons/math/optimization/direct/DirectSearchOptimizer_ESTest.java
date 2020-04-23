/*

 * Tue Apr 21 10:11:40 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1130.588);
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = 258.4238644;
      doubleArray0[3] = 937.850395042693;
      doubleArray0[4] = 258.4238644;
      doubleArray0[5] = (-683.33519731);
      doubleArray0[6] = 1736.65;
      nelderMead0.setStartConfiguration(doubleArray0);
      nelderMead0.incrementIterationsCounter();
      nelderMead0.setStartConfiguration(doubleArray0);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 590.8;
      NelderMead nelderMead1 = new NelderMead();
      nelderMead0.setMaxIterations((-479));
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-479) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
