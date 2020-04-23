/*

 * Tue Apr 21 08:30:08 UTC 2020
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
      GoalType goalType0 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(90);
      int int0 = (-211);
      int int1 = 208;
      GoalType goalType1 = GoalType.MAXIMIZE;
      sumSincFunction0.gradient();
      GoalType goalType2 = GoalType.MINIMIZE;
      int int2 = 14;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(14, (-211), 3.1);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 14;
      doubleArray0[1] = 3.1;
      doubleArray0[2] = (double) 14;
      doubleArray0[3] = 0.0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(208, sumSincFunction0, goalType1, doubleArray0);
  }
}
