/*

 * Tue Apr 21 08:34:07 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      int int0 = BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION;
      SumSincFunction sumSincFunction0 = new SumSincFunction(2);
      sumSincFunction0.gradient();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 253.2061511887941;
      doubleArray0[1] = 253.2061511887941;
      doubleArray0[2] = (double) 2843;
      doubleArray0[4] = (double) 2;
      sumSincFunction0.value(doubleArray0);
      sumSincFunction0.gradient();
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12);
      GoalType goalType0 = GoalType.MAXIMIZE;
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(12, sumSincFunction0, goalType1, doubleArray0);
  }
}
