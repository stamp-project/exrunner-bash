/*

 * Tue Apr 21 08:29:14 UTC 2020
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
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 12;
      boolean boolean0 = false;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12);
      int int1 = 2514;
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(2514);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      double double0 = (-1.0);
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) (-2302);
      sumSincFunction0.value(doubleArray0);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) (-2302);
      doubleArray1[3] = (double) (-2302);
      doubleArray1[4] = (double) 2514;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(2514, sumSincFunction0, goalType0, doubleArray1);
  }
}
