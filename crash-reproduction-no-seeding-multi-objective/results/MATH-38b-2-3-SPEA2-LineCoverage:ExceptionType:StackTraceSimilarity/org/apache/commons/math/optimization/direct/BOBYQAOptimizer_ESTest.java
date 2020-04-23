/*

 * Tue Apr 21 08:30:44 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-720));
      SumSincFunction sumSincFunction0 = new SumSincFunction(439.35122847);
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(27);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1074.39943067733;
      bOBYQAOptimizer1.getMaxEvaluations();
      doubleArray0[1] = 24.373;
      doubleArray0[2] = (double) 27;
      doubleArray0[3] = (double) 720;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(656, sumSincFunction0, goalType0, doubleArray0);
  }
}
