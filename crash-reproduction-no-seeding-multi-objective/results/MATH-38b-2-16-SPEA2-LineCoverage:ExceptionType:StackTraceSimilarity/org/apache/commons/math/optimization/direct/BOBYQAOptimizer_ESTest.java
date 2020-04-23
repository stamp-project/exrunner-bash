/*

 * Tue Apr 21 08:33:47 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(2948.65654057);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(15, (-1690.5915895572418), 1.0E-8);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1306.53722);
      doubleArray0[1] = (-1306.53722);
      doubleArray0[2] = (double) (-881);
      doubleArray0[3] = 1.1102230246251565E-14;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1666, sumSincFunction0, goalType0, doubleArray0);
  }
}
