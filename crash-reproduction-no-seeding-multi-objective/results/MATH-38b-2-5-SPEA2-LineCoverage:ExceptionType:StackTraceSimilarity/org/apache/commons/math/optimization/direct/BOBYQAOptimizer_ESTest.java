/*

 * Tue Apr 21 08:33:18 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 189;
      int int1 = 9;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1037.2472412));
      sumSincFunction0.partialDerivative(9);
      GoalType goalType0 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9, (-1037.2472412), 9);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 189;
      doubleArray0[1] = (double) 189;
      double double0 = 2598.6;
      sumSincFunction0.gradient();
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(9, sumSincFunction0, goalType1, doubleArray0);
  }
}
