/*

 * Tue Apr 21 08:37:05 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(36, 65, 36);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[] doubleArray0 = new double[9];
      sumSincFunction0.gradient();
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 36;
      doubleArray0[3] = (-1258.5);
      double[] doubleArray1 = new double[0];
      sumSincFunction0.value(doubleArray1);
      doubleArray0[4] = (double) 65;
      doubleArray0[5] = (double) 65;
      doubleArray0[6] = (double) 65;
      doubleArray0[7] = (double) 65;
      doubleArray0[8] = 0.0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(36, sumSincFunction0, goalType0, doubleArray0);
  }
}
