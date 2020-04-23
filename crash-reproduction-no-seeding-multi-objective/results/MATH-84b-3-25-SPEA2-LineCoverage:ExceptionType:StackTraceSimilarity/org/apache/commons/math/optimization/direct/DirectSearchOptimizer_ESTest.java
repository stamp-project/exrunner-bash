/*

 * Tue Apr 21 10:16:55 UTC 2020
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      multiDirectional0.setMaxIterations(1978);
      doubleArray0[1] = (-2149.0638864957364);
      doubleArray0[3] = (-2149.0638864957364);
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-2149.0638864957364);
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0);
      MultivariateVectorialFunction multivariateVectorialFunction1 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      LeastSquaresConverter leastSquaresConverter1 = new LeastSquaresConverter(multivariateVectorialFunction1, doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[0];
      try { 
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray2);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (1,978) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
