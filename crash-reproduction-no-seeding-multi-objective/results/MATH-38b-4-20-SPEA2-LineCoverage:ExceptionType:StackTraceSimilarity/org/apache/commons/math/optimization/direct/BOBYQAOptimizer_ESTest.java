/*

 * Tue Apr 21 08:34:33 UTC 2020
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
      int int0 = (-1316);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      sumSincFunction0.partialDerivative(205);
      int int1 = 20;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(20, 205, (-1));
      SumSincFunction sumSincFunction1 = new SumSincFunction(Double.POSITIVE_INFINITY);
      sumSincFunction1.gradient();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1316);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 20;
      doubleArray0[3] = (double) 205;
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      doubleArray0[5] = (double) 20;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(2440, sumSincFunction1, goalType0, doubleArray0);
  }
}
