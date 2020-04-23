/*

 * Tue Apr 21 08:37:22 UTC 2020
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
      int int0 = 5;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(5);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(14, 893, 5);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2181.649));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 957702906;
      doubleArray0[1] = (double) 957702906;
      doubleArray0[2] = (double) 957702906;
      doubleArray0[3] = (double) 5;
      doubleArray0[4] = (double) 957702906;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(957702906, sumSincFunction0, goalType0, doubleArray0);
  }
}
