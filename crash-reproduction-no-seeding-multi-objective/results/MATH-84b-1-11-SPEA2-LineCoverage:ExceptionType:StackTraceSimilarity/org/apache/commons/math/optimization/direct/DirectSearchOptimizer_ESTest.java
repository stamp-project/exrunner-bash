/*

 * Tue Apr 21 10:12:53 UTC 2020
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
      NelderMead nelderMead0 = new NelderMead(2492, 3659.56499127, 0.66, (-483.0));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-201.4293713543);
      doubleArray0[1] = Double.NaN;
      doubleArray0[2] = 3659.56499127;
      doubleArray0[3] = (-483.0);
      doubleArray0[4] = (double) 2492;
      doubleArray0[5] = (-483.0);
      nelderMead0.setStartConfiguration(doubleArray0);
      nelderMead0.getMaxIterations();
      nelderMead0.setMaxIterations((-1648));
      NelderMead nelderMead1 = new NelderMead((-1.0), 0.467, (-201.4293713543), 7.0);
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,648) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
