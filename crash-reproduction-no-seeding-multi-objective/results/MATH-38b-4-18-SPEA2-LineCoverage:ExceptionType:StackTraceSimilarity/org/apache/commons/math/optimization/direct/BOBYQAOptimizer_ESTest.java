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
      int int0 = 9;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      int int1 = 74;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1949.501452684);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 729.0;
      doubleArray0[1] = (double) 74;
      doubleArray0[2] = (double) 9;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(74, sumSincFunction0, goalType0, doubleArray0);
  }
}
