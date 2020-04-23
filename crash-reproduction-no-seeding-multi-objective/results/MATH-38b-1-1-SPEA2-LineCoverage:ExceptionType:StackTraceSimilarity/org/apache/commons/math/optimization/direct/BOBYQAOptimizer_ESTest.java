/*

 * Tue Apr 21 08:29:07 UTC 2020
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
      int int0 = (-1395);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(28, (-1395), (-1395));
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1395));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1395);
      doubleArray0[1] = (double) (-1395);
      doubleArray0[2] = 1467.6875;
      doubleArray0[3] = (double) (-1395);
      doubleArray0[4] = (-0.5);
      doubleArray0[5] = 1467.6875;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(28, sumSincFunction0, goalType0, doubleArray0);
  }
}
