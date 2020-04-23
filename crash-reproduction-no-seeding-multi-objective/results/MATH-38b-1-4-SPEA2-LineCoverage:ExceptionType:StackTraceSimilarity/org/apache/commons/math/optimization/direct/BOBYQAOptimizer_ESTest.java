/*

 * Tue Apr 21 08:30:09 UTC 2020
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
      int int0 = 234;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(234);
      int int1 = BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION;
      int int2 = 8;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(8, 1.0, 234);
      double double0 = 3010.0;
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(8, 0.0, 3010.0);
      double double1 = 0.0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      SumSincFunction sumSincFunction1 = new SumSincFunction(1.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[3];
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(234, sumSincFunction1, goalType1, doubleArray0);
  }
}
