/*

 * Tue Apr 21 08:35:18 UTC 2020
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
      int int0 = 11;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(11);
      int int1 = 7;
      double double0 = 1.0E-8;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1.0E-8);
      int int2 = 96;
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0E-8;
      doubleArray0[1] = 1.0E-8;
      doubleArray0[2] = (double) 11;
      doubleArray0[3] = (double) 11;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(96, sumSincFunction0, goalType0, doubleArray0);
  }
}
