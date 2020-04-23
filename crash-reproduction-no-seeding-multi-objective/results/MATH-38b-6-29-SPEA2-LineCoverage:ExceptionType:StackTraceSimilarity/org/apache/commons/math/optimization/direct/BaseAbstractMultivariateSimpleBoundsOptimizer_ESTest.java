/*

 * Tue Apr 21 08:36:10 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(655.59746, 655.59746, (-2091.2709), 655.59746, (-3664.3527864)).when(multivariateFunction0).value(any(double[].class));
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(13, 16.0, 16.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(13);
      sumSincFunction0.gradient();
      double[] doubleArray0 = new double[4];
      sumSincFunction0.gradient();
      doubleArray0[0] = 931.0;
      doubleArray0[2] = 16.0;
      doubleArray0[3] = (double) 13;
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      int int0 = (-343);
      sumSincFunction0.partialDerivative(19);
      SumSincFunction sumSincFunction1 = new SumSincFunction(0.0);
      GoalType goalType1 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(19, multivariateFunction0, goalType1, doubleArray0);
  }
}
