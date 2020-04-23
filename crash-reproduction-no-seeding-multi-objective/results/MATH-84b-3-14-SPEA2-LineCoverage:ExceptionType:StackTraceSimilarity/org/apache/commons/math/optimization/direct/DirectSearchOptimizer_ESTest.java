/*

 * Tue Apr 21 10:15:33 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker();
      nelderMead0.setConvergenceChecker(simpleRealPointChecker0);
      nelderMead0.incrementIterationsCounter();
      double[] doubleArray0 = new double[16];
      MultiDirectional multiDirectional0 = new MultiDirectional();
      SimpleRealPointChecker simpleRealPointChecker1 = new SimpleRealPointChecker();
      multiDirectional0.setConvergenceChecker(simpleRealPointChecker1);
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-1311));
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0);
      MultivariateVectorialFunction multivariateVectorialFunction1 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(multivariateVectorialFunction1).value(any(double[].class));
      LeastSquaresConverter leastSquaresConverter1 = new LeastSquaresConverter(multivariateVectorialFunction1, doubleArray0, doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 2271.2870791515206;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 1.0;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = 0.0;
      try { 
        multiDirectional0.optimize(leastSquaresConverter1, goalType0, doubleArray1);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,311) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
