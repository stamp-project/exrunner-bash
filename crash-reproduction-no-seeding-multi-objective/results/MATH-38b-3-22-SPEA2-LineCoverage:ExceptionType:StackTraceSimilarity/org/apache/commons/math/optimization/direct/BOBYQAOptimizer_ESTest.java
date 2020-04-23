/*

 * Tue Apr 21 08:35:13 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(2.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2.0;
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1899.0;
      doubleArray1[1] = (double) 20;
      sumSincFunction0.value(doubleArray1);
      doubleArray0[3] = (-1763.1);
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = 2.0;
      doubleArray0[3] = 2.0;
      doubleArray0[5] = (double) 20;
      doubleArray0[6] = 2.0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(20, sumSincFunction0, goalType0, doubleArray0);
  }
}
