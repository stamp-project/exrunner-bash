/*

 * Tue Apr 21 08:31:49 UTC 2020
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
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(8, 2041.1167588998, 2041.1167588998);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(8, 1005, 1005);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-3674.255));
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer((-1));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1005;
      doubleArray0[1] = (-3674.255);
      doubleArray0[2] = (double) 13;
      sumSincFunction0.gradient();
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(13, sumSincFunction0, goalType0, doubleArray0);
  }
}
