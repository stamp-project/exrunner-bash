/*

 * Tue Apr 21 08:32:12 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18);
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.1102230246251565E-14);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.1102230246251565E-14;
      doubleArray0[1] = (double) 18;
      doubleArray0[2] = 1.1102230246251565E-14;
      doubleArray0[3] = 267.959;
      doubleArray0[4] = (double) 7;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(173, multivariateFunction0, goalType0, doubleArray0);
  }
}
