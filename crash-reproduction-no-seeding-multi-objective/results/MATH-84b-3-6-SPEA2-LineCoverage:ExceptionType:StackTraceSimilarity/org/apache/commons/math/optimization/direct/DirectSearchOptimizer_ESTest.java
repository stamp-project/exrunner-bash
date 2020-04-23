/*

 * Tue Apr 21 10:15:55 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
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
      MultiDirectional multiDirectional0 = new MultiDirectional();
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 1976.83005, 1.0, 1415.92, 0.0).when(multivariateRealFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 505.0;
      multiDirectional0.setMaxIterations(3321);
      GoalType goalType0 = GoalType.MAXIMIZE;
      multiDirectional0.setMaxIterations(44);
      MultiDirectional multiDirectional1 = new MultiDirectional(Double.NaN, 1.0);
      MultiDirectional multiDirectional2 = new MultiDirectional((-421.5764608), 505.0);
      multiDirectional2.getConvergenceChecker();
      RealConvergenceChecker realConvergenceChecker0 = multiDirectional0.getConvergenceChecker();
      multiDirectional0.setConvergenceChecker(realConvergenceChecker0);
      try { 
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (44) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
