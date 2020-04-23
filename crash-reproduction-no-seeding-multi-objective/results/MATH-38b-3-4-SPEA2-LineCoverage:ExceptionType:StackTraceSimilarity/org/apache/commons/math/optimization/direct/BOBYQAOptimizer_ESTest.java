/*

 * Tue Apr 21 08:30:24 UTC 2020
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
      int int0 = 54;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(54);
      bOBYQAOptimizer0.getConvergenceChecker();
      SumSincFunction sumSincFunction0 = new SumSincFunction(54);
      int int1 = 214;
      sumSincFunction0.partialDerivative(214);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 214;
      doubleArray0[1] = (-421.366519393);
      bOBYQAOptimizer0.getMaxEvaluations();
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(189, sumSincFunction0, goalType1, doubleArray0);
  }
}
