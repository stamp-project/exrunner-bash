/*

 * Tue Apr 21 08:34:32 UTC 2020
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
      GoalType goalType0 = GoalType.MAXIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(234.066631422491);
      double[] doubleArray0 = new double[7];
      SumSincFunction sumSincFunction1 = new SumSincFunction(Double.POSITIVE_INFINITY);
      sumSincFunction1.partialDerivative(230);
      GoalType goalType1 = GoalType.MAXIMIZE;
      sumSincFunction1.partialDerivative(210);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(35, 850, (-1954.4217));
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(850, sumSincFunction0, goalType1, doubleArray0);
  }
}
