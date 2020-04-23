/*

 * Tue Apr 21 08:33:41 UTC 2020
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
      GoalType goalType0 = GoalType.MINIMIZE;
      MultivariateFunction multivariateFunction1 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      MultivariateFunction multivariateFunction2 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(10);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 10;
      doubleArray0[1] = (double) 10;
      SumSincFunction sumSincFunction0 = new SumSincFunction(3009.48299565947);
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1011, sumSincFunction0, goalType1, doubleArray0);
  }
}
