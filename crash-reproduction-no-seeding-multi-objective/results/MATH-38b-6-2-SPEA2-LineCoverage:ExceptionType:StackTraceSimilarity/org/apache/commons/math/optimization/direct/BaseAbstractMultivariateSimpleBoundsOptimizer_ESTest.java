/*

 * Tue Apr 21 08:28:58 UTC 2020
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
      int int0 = 25;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(25);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-583.692));
      sumSincFunction0.gradient();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1531.832792;
      doubleArray0[1] = 1531.832792;
      bOBYQAOptimizer0.getMaxEvaluations();
      sumSincFunction0.gradient();
      doubleArray0[4] = (double) 25;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(25, sumSincFunction0, goalType0, doubleArray0);
  }
}
