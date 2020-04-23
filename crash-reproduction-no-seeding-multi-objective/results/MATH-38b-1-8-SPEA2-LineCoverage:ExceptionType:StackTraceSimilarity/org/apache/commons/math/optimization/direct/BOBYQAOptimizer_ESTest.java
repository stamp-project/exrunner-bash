/*

 * Tue Apr 21 08:31:55 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(20);
      SumSincFunction sumSincFunction0 = new SumSincFunction(Double.POSITIVE_INFINITY);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 3074;
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = (-804.6707678496);
      doubleArray0[3] = (double) 20;
      doubleArray0[4] = (-804.6707678496);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(3074, sumSincFunction0, goalType0, doubleArray0);
  }
}
