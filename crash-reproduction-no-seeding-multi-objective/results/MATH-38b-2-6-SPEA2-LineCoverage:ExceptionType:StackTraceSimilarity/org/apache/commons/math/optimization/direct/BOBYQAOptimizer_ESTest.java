/*

 * Tue Apr 21 08:31:14 UTC 2020
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
      double double0 = 1453.113;
      int int0 = 43;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(43);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) (-2149);
      doubleArray0[2] = (double) (-2149);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      double double1 = (-40.2254);
      doubleArray0[5] = (-40.2254);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = (double) (-2149);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(43, sumSincFunction0, goalType0, doubleArray0);
  }
}
