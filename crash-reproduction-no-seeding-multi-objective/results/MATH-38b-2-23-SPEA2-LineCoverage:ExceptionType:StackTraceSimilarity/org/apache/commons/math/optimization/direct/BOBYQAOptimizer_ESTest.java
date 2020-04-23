/*

 * Tue Apr 21 08:35:48 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(51, 51, 0.1);
      SumSincFunction sumSincFunction0 = new SumSincFunction(3375.798090136238);
      SumSincFunction sumSincFunction1 = new SumSincFunction(0.1);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 3375.798090136238;
      doubleArray0[1] = 3375.798090136238;
      doubleArray0[2] = (double) 1689;
      doubleArray0[6] = (double) 1689;
      doubleArray0[4] = 3375.798090136238;
      doubleArray0[5] = (double) 51;
      doubleArray0[6] = (double) 51;
      doubleArray0[7] = 2.2250738585072014E-308;
      doubleArray0[8] = (double) 51;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1689, sumSincFunction1, goalType0, doubleArray0);
  }
}
