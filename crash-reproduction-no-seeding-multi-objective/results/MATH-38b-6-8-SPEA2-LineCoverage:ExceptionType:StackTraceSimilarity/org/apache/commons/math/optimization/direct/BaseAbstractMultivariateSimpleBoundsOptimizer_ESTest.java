/*

 * Tue Apr 21 08:31:02 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(42);
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(17.0);
      sumSincFunction0.partialDerivative(2095);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 13.823314173692129;
      doubleArray0[1] = (double) 1197;
      doubleArray0[2] = (double) 1197;
      doubleArray0[3] = 1.0E-12;
      doubleArray0[4] = 4011.5605;
      doubleArray0[5] = 17.0;
      doubleArray0[6] = (double) 1197;
      doubleArray0[7] = 13.823314173692129;
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1197, sumSincFunction0, goalType1, doubleArray0);
  }
}
