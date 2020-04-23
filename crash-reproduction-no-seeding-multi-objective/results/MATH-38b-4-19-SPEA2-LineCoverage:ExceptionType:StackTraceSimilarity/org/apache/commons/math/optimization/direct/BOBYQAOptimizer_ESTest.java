/*

 * Tue Apr 21 08:34:38 UTC 2020
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
      int int0 = 0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0);
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(15);
      SumSincFunction sumSincFunction1 = new SumSincFunction(0);
      sumSincFunction1.partialDerivative((-1519));
      GoalType goalType1 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      int int1 = 1363;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(1363, sumSincFunction1, goalType1, doubleArray0);
  }
}
