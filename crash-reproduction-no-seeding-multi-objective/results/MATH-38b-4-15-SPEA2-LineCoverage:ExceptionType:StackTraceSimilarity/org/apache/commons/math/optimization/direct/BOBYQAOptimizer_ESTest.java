/*

 * Tue Apr 21 08:33:29 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(1362.06477);
      int int0 = 2805;
      int int1 = 28;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(28);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1362.06477;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (-104.38);
      doubleArray0[3] = (double) 28;
      doubleArray0[4] = 0.5;
      doubleArray0[5] = 1362.06477;
      doubleArray0[6] = 1362.06477;
      doubleArray0[7] = (double) 28;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(28, sumSincFunction0, goalType0, doubleArray0);
  }
}
