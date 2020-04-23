/*

 * Tue Apr 21 08:34:09 UTC 2020
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
      int int0 = 10;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(10);
      double double0 = (-520.1124);
      int int1 = BOBYQAOptimizer.MINIMUM_PROBLEM_DIMENSION;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[] doubleArray0 = new double[4];
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(192031952, sumSincFunction0, goalType0, doubleArray0);
  }
}
