/*

 * Tue Apr 21 08:36:11 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(360);
      sumSincFunction0.partialDerivative(36);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(36);
      double[] doubleArray0 = new double[7];
      SumSincFunction sumSincFunction1 = new SumSincFunction(2.0E-12);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(38);
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(34);
      SumSincFunction sumSincFunction2 = new SumSincFunction(2186);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(338, sumSincFunction0, goalType0, doubleArray0);
  }
}
