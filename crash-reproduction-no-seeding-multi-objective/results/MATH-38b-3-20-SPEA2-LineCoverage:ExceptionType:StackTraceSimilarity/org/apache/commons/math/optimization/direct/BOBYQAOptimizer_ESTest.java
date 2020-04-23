/*

 * Tue Apr 21 08:34:57 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(20, 1724.11774, 0.0);
      bOBYQAOptimizer0.getConvergenceChecker();
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1724.11774, (double)20, 0.125, 653.3646903369, (-5273.32626)).when(multivariateFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 0.0;
      int int0 = 28;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(232, multivariateFunction0, goalType0, doubleArray0);
  }
}
