/*

 * Tue Apr 21 08:32:38 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(21);
      bOBYQAOptimizer0.getEvaluations();
      bOBYQAOptimizer0.getEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(165);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[5] = 20.0;
      doubleArray0[2] = (double) 165;
      doubleArray0[3] = (-852.2);
      doubleArray0[4] = (double) 21;
      doubleArray0[5] = 20.0;
      doubleArray0[6] = (double) 165;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(20, sumSincFunction0, goalType0, doubleArray0);
  }
}
