/*

 * Tue Apr 21 08:36:19 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-2929));
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer((-2929));
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(7, (-3209.3225979926), 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-326.9069158));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.001;
      doubleArray0[1] = (double) 7;
      doubleArray0[2] = (-326.9069158);
      int int0 = (-10);
      BOBYQAOptimizer bOBYQAOptimizer3 = new BOBYQAOptimizer(16, 16, 1478.522033788634);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-3066));
      // Undeclared exception!
      bOBYQAOptimizer3.optimize(3363, (MultivariateFunction) sumSincFunction1, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
