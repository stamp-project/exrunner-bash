/*

 * Tue Apr 21 08:29:47 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(14);
      int int0 = 150;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1611.9);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 14;
      doubleArray0[1] = (double) 150;
      doubleArray0[2] = (-1551.8453171252768);
      doubleArray0[3] = (double) 14;
      GoalType goalType1 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(14, sumSincFunction0, goalType1, doubleArray0);
  }
}
