/*

 * Tue Apr 21 08:32:39 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2918.63418;
      int int0 = 3503;
      int int1 = 19650218;
      int[] intArray0 = new int[7];
      double double1 = 0.0;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(19650218, 3503);
      int int2 = (-1338);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[11];
      doubleArray1[2] = 2918.63418;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(19650218);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(65);
      SumSincFunction sumSincFunction0 = new SumSincFunction(7.962832297769345E-8);
      SumSincFunction sumSincFunction1 = new SumSincFunction(7.962832297769345E-8);
      sumSincFunction1.value(doubleArray1);
      SumSincFunction sumSincFunction2 = new SumSincFunction(1.0);
      sumSincFunction2.gradient();
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(65, sumSincFunction0, goalType0, doubleArray1);
  }
}
