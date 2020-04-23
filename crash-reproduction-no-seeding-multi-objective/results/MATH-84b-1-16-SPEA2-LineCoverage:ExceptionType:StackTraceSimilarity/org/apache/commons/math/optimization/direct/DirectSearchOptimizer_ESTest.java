/*

 * Tue Apr 21 10:13:40 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead(0.0, Double.NaN, 4.39, Double.NaN);
      nelderMead0.incrementIterationsCounter();
      nelderMead0.getIterations();
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = null;
      nelderMead0.setMaxIterations(1);
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
