/*

 * Tue Apr 21 08:35:54 UTC 2020
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
      int int0 = 36;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(22, 36, 10.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(24.84143621);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 22;
      doubleArray0[1] = (double) 22;
      doubleArray0[2] = 10.0;
      doubleArray0[3] = (double) 22;
      doubleArray0[4] = 10.0;
      int int1 = 88;
      sumSincFunction0.partialDerivative(36);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(88, sumSincFunction0, goalType0, doubleArray0);
  }
}
