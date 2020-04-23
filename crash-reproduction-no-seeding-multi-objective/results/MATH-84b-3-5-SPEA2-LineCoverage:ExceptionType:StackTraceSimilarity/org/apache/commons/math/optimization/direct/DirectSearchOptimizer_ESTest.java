/*

 * Tue Apr 21 10:12:21 UTC 2020
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
      double double0 = 974.29;
      MultiDirectional multiDirectional0 = new MultiDirectional(1028.3410266, 974.29);
      multiDirectional0.setMaxIterations(921);
      int int0 = 10;
      multiDirectional0.setMaxEvaluations(10);
      double[] doubleArray0 = new double[0];
      multiDirectional0.setStartConfiguration(doubleArray0);
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0, doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (921) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
