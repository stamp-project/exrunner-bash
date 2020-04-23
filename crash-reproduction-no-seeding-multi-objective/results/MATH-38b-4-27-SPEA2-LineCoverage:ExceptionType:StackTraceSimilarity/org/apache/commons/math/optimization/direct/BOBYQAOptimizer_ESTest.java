/*

 * Tue Apr 21 08:36:43 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(14, 14, 14);
      SumSincFunction sumSincFunction0 = new SumSincFunction(2031.7);
      SumSincFunction sumSincFunction1 = new SumSincFunction(14);
      sumSincFunction0.partialDerivative(1039);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[5];
      sumSincFunction0.gradient();
      doubleArray0[0] = (double) 14;
      doubleArray0[1] = 2031.7;
      doubleArray0[2] = 14.0;
      doubleArray0[3] = (-4418.99770961903);
      doubleArray0[4] = (double) 14;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(14, sumSincFunction0, goalType0, doubleArray0);
  }
}
