/*

 * Tue Apr 21 10:13:55 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
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
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.getMaxIterations();
      double double0 = (-1288.17207617325);
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-389.77471395413033), (-1288.17207617325), (-389.77471395413033), (-389.77471395413033), (-1288.17207617325)).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2426.92084;
      doubleArray0[1] = (double) Integer.MAX_VALUE;
      doubleArray0[2] = (double) Integer.MAX_VALUE;
      doubleArray0[3] = (double) Integer.MAX_VALUE;
      doubleArray0[4] = (double) Integer.MAX_VALUE;
      doubleArray0[5] = (double) Integer.MAX_VALUE;
      multiDirectional0.setMaxIterations(10);
      NelderMead nelderMead0 = new NelderMead(2149.375654, 0.0, Double.NaN, 10);
      multiDirectional0.setMaxEvaluations(Integer.MAX_VALUE);
      int int0 = 55;
      nelderMead0.setMaxEvaluations(55);
      multiDirectional0.incrementIterationsCounter();
      try { 
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (10) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
