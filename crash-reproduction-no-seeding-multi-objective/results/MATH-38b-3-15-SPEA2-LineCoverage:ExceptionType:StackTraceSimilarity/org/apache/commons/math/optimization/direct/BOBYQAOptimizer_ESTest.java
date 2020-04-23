/*

 * Tue Apr 21 08:33:36 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(15);
      SumSincFunction sumSincFunction0 = new SumSincFunction(15);
      sumSincFunction0.partialDerivative(50);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 15;
      doubleArray0[1] = (double) 15;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(15);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 15;
      doubleArray1[1] = (double) 15;
      doubleArray1[2] = (double) 50;
      doubleArray1[3] = 0.0;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(1843, sumSincFunction0, goalType0, doubleArray1);
  }
}
