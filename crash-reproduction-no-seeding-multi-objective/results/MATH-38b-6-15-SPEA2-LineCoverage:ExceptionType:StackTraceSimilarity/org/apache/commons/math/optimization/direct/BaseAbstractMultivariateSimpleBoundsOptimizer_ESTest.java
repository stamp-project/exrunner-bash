/*

 * Tue Apr 21 08:32:41 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(2132);
      SumSincFunction sumSincFunction0 = new SumSincFunction(2132);
      GoalType goalType0 = GoalType.MINIMIZE;
      int int0 = 50;
      int int1 = 9;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(9, 0.5, 2032.78601323056);
      SumSincFunction sumSincFunction1 = new SumSincFunction(2032.78601323056);
      GoalType goalType1 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 9;
      doubleArray0[1] = 1049.56;
      doubleArray0[2] = (double) 9;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(788, sumSincFunction0, goalType1, doubleArray0);
  }
}
