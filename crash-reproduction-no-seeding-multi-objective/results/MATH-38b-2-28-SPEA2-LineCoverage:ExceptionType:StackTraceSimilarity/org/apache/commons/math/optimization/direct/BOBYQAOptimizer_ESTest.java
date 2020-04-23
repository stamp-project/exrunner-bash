/*

 * Tue Apr 21 08:37:30 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9, 386.227847944, 0.0);
      bOBYQAOptimizer0.getEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 9;
      doubleArray0[1] = (double) 9;
      bOBYQAOptimizer0.getEvaluations();
      GoalType goalType0 = GoalType.MAXIMIZE;
      bOBYQAOptimizer0.getEvaluations();
      int int0 = 681;
      sumSincFunction0.value(doubleArray0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(681, (MultivariateFunction) sumSincFunction0, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
