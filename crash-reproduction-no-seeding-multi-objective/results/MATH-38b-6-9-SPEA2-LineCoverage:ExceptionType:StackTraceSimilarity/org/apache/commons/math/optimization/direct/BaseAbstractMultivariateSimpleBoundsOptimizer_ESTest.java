/*

 * Tue Apr 21 08:31:03 UTC 2020
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
      double[] doubleArray0 = new double[9];
      int int1 = 1;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(1, 25, 1456.35603184242);
      SumSincFunction sumSincFunction0 = new SumSincFunction(Double.POSITIVE_INFINITY);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(25, sumSincFunction0, goalType0, doubleArray0);
  }
}
