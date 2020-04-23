/*

 * Tue Apr 21 08:33:11 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16);
      bOBYQAOptimizer0.getEvaluations();
      bOBYQAOptimizer0.getMaxEvaluations();
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(0, 0, 0);
      int int0 = 239;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0);
      MultivariateFunction multivariateFunction1 = sumSincFunction0.partialDerivative(0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(239, multivariateFunction1, goalType0, doubleArray0);
  }
}
