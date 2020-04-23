/*

 * Tue Apr 21 10:13:21 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-628.45782);
      doubleArray0[1] = (-628.45782);
      doubleArray0[2] = (-628.45782);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-628.45782);
      doubleArray0[5] = (-628.45782);
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[6];
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray0);
      MultiDirectional multiDirectional0 = new MultiDirectional();
      MultivariateVectorialFunction multivariateVectorialFunction1 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      LeastSquaresConverter leastSquaresConverter1 = new LeastSquaresConverter(multivariateVectorialFunction1, doubleArray1);
      multiDirectional0.setMaxEvaluations(947);
      MultiDirectional multiDirectional1 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1609));
      leastSquaresConverter0.value(doubleArray1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      multiDirectional1.setMaxIterations(1);
      try { 
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray1);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,609) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
