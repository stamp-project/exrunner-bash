/*

 * Tue Apr 21 08:38:20 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(64);
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(multivariateFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[14];
      doubleArray0[7] = (double) 64;
      doubleArray0[1] = (double) 64;
      GoalType goalType0 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(20.0);
      SumSincFunction sumSincFunction1 = new SumSincFunction(832.9200260381967);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(64, multivariateFunction0, goalType0, doubleArray0);
  }
}
