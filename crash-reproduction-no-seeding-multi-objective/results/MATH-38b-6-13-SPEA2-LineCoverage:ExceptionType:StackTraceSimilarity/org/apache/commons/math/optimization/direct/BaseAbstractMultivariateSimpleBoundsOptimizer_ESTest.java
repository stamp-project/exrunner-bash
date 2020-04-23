/*

 * Tue Apr 21 08:32:07 UTC 2020
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
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoalType goalType0 = GoalType.MINIMIZE;
      int int0 = BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION;
      GoalType goalType1 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(10, 10, 2);
      SumSincFunction sumSincFunction0 = new SumSincFunction(10);
      int int1 = 9;
      int int2 = 66;
      SumSincFunction sumSincFunction1 = new SumSincFunction(2);
      MultivariateFunction multivariateFunction0 = sumSincFunction1.partialDerivative(2);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 10;
      doubleArray0[1] = (double) 9;
      doubleArray0[2] = (double) 10;
      doubleArray0[3] = (double) 66;
      GoalType goalType2 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(10, multivariateFunction0, goalType2, doubleArray0);
  }
}
