/*

 * Tue Apr 21 10:15:09 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RealConvergenceChecker realConvergenceChecker0 = mock(RealConvergenceChecker.class, new ViolatedAssumptionAnswer());
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1189.217), (-1189.217), (-3123.108), 1248.6608895, 1248.6608895).when(multivariateRealFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 10.0;
      MultiDirectional multiDirectional0 = new MultiDirectional((-5129.15249), 0.0);
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      multiDirectional0.setMaxIterations((-2050));
      try { 
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,050) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
