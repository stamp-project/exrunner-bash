/*

 * Tue Apr 21 08:29:55 UTC 2020
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
      int int0 = 275;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(11, 275, (-3018.18348318));
      bOBYQAOptimizer0.getEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1092.67880895553));
      sumSincFunction0.partialDerivative(0);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(275, 7.595150884462959E7, 275);
      bOBYQAOptimizer1.getEvaluations();
      SumSincFunction sumSincFunction1 = new SumSincFunction((-3018.18348318));
      sumSincFunction1.partialDerivative((-4193));
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(11, (-3733.764), (-1066.25697856));
      SumSincFunction sumSincFunction2 = new SumSincFunction((-1.0));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1066.25697856);
      doubleArray0[1] = (-1092.67880895553);
      doubleArray0[2] = (double) 11;
      doubleArray0[3] = (-1066.25697856);
      // Undeclared exception!
      bOBYQAOptimizer2.optimize(2147483617, sumSincFunction2, goalType0, doubleArray0);
  }
}
