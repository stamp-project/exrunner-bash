/*

 * Tue Apr 21 08:34:21 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(41, (-618.858482412), (-2894.2967088699024));
      GoalType goalType0 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2704.204));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-2894.2967088699024);
      sumSincFunction0.partialDerivative(1855);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = Double.NaN;
      doubleArray0[2] = (-2704.204);
      doubleArray0[4] = (double) 681;
      doubleArray0[5] = (-618.858482412);
      doubleArray0[6] = (-618.858482412);
      SumSincFunction sumSincFunction1 = new SumSincFunction(2897.652);
      doubleArray0[7] = (-2704.204);
      doubleArray0[8] = 2897.652;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(41, sumSincFunction0, goalType0, doubleArray0);
  }
}
