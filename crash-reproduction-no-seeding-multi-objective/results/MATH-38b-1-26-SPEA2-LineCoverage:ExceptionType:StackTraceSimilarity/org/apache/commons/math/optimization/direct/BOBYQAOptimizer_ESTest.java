/*

 * Tue Apr 21 08:37:20 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((-28));
      GoalType goalType0 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(45, 208.4379, 20.0);
      int int0 = 720;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.1102230246251565E-14);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2345;
      doubleArray0[1] = (double) (-1250);
      doubleArray0[2] = 20.0;
      doubleArray0[3] = 208.4379;
      doubleArray0[4] = 430.25582727283756;
      doubleArray0[5] = 20.0;
      doubleArray0[6] = (double) 720;
      doubleArray0[7] = (double) 2345;
      doubleArray0[8] = 20.0;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(720, sumSincFunction0, goalType0, doubleArray0);
  }
}
