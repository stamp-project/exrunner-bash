/*

 * Tue Apr 21 08:32:57 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SumSincFunction sumSincFunction0 = new SumSincFunction(16.0);
      sumSincFunction0.partialDerivative(40);
      GoalType goalType0 = GoalType.MINIMIZE;
      GoalType goalType1 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction1 = new SumSincFunction(1659);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 40;
      doubleArray0[1] = (double) 40;
      sumSincFunction1.value(doubleArray0);
      doubleArray0[2] = (double) 1659;
      doubleArray0[3] = (double) 210;
      doubleArray0[4] = 16.0;
      doubleArray0[5] = (double) 40;
      doubleArray0[6] = (double) 210;
      doubleArray0[7] = (double) 40;
      doubleArray0[8] = 0.0;
      sumSincFunction1.value(doubleArray0);
      MultivariateFunction multivariateFunction0 = sumSincFunction1.partialDerivative(1);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(40, 40.0, 40.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(50, multivariateFunction0, goalType1, doubleArray0);
  }
}
