/*

 * Tue Apr 21 10:18:54 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
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
      nelderMead0.setMaxIterations((-2054));
      RealConvergenceChecker realConvergenceChecker0 = nelderMead0.getConvergenceChecker();
      nelderMead0.setConvergenceChecker(realConvergenceChecker0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      double[][] doubleArray1 = new double[1][1];
      doubleArray1[0] = doubleArray0;
      MultiDirectional multiDirectional0 = new MultiDirectional(0.651, 153.3171);
      multiDirectional0.setMaxIterations(17);
      RealConvergenceChecker realConvergenceChecker1 = nelderMead0.getConvergenceChecker();
      nelderMead0.setConvergenceChecker(realConvergenceChecker1);
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray1);
      RealMatrix realMatrix0 = array2DRowRealMatrix0.scalarMultiply((-2024.0));
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0, realMatrix0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (17) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
