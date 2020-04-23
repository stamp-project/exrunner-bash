/*

 * Tue Apr 21 08:36:12 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-21.220436916346582));
      SumSincFunction sumSincFunction1 = new SumSincFunction(66.37263846559405);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 66.37263846559405;
      doubleArray0[1] = 66.37263846559405;
      doubleArray0[2] = (-21.220436916346582);
      doubleArray0[3] = (double) 23;
      doubleArray0[4] = (double) 23;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(23, sumSincFunction0, goalType0, doubleArray0);
  }
}
