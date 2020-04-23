/*

 * Tue Apr 21 08:32:05 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      SumSincFunction sumSincFunction0 = new SumSincFunction(9);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-4427.272));
      sumSincFunction1.gradient();
      bOBYQAOptimizer0.getMaxEvaluations();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SumSincFunction sumSincFunction2 = new SumSincFunction(171.02);
      sumSincFunction2.partialDerivative((-21));
      sumSincFunction2.gradient();
      bOBYQAOptimizer0.getMaxEvaluations();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(13, sumSincFunction1, goalType0, doubleArray0);
  }
}
