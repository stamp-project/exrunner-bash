/*

 * Tue Apr 21 08:34:41 UTC 2020
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
      int int0 = 50;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(50);
      SumSincFunction sumSincFunction0 = new SumSincFunction(308);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[23];
      doubleArray0[0] = (double) 308;
      doubleArray0[1] = (-2406.7167721358874);
      doubleArray0[2] = (double) 50;
      doubleArray0[3] = (double) 50;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(308, sumSincFunction0, goalType0, doubleArray0);
  }
}
