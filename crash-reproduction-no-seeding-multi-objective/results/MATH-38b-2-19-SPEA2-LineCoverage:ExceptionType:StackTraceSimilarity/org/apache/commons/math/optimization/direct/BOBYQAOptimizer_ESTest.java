/*

 * Tue Apr 21 08:34:53 UTC 2020
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[4] = Double.NEGATIVE_INFINITY;
      doubleArray0[5] = Double.NEGATIVE_INFINITY;
      int int0 = 31;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(31, Double.NEGATIVE_INFINITY, 1.1102230246251565E-14);
      bOBYQAOptimizer0.getMaxEvaluations();
      int int1 = 30;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1.0000000000000003E-4));
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }
}
