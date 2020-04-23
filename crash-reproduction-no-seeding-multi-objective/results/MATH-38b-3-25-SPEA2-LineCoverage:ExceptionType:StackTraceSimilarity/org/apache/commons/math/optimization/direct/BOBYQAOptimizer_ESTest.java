/*

 * Tue Apr 21 08:35:56 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction((-3568));
      SumSincFunction sumSincFunction1 = new SumSincFunction((-3568));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[6];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(20, 2491, (-1705.0));
      SumSincFunction sumSincFunction2 = new SumSincFunction((-3399.5701974614067));
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-148597.62514314064);
      doubleArray1[1] = (double) (-3568);
      doubleArray1[2] = (double) 2491;
      doubleArray1[3] = (double) (-3568);
      doubleArray1[4] = (-128.92051276263598);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(20, sumSincFunction1, goalType0, doubleArray1);
  }
}
