/*

 * Tue Apr 21 10:15:34 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      nelderMead0.incrementIterationsCounter();
      nelderMead0.setMaxIterations(2);
      nelderMead0.setMaxEvaluations(18);
      nelderMead0.incrementIterationsCounter();
      MultiDirectional multiDirectional0 = new MultiDirectional();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 18;
      doubleArray0[1] = (double) 18;
      doubleArray0[2] = (double) 18;
      nelderMead0.getEvaluations();
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (2) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
