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
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(55);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[12];
      doubleArray0[1] = (double) 55;
      doubleArray0[1] = (double) 55;
      doubleArray0[2] = (double) 55;
      doubleArray0[3] = (double) 55;
      double double0 = 1.0896020163877822;
      double double1 = CMAESOptimizer.DEFAULT_STOPFITNESS;
      SumSincFunction sumSincFunction0 = new SumSincFunction(55);
      double double2 = BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS;
      double[] doubleArray1 = new double[9];
      doubleArray0[3] = (double) 55;
      doubleArray1[3] = (double) 55;
      sumSincFunction0.partialDerivative(55);
      sumSincFunction0.value(doubleArray0);
      doubleArray1[4] = (double) 55;
      doubleArray1[5] = 10.0;
      doubleArray0[1] = 10.0;
      doubleArray1[7] = (double) 55;
      doubleArray1[8] = (double) 55;
      sumSincFunction0.value(doubleArray1);
      double[] doubleArray2 = new double[22];
      sumSincFunction0.gradient();
      sumSincFunction0.gradient();
      doubleArray1[4] = (double) 55;
      doubleArray2[13] = (double) 55;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(55, sumSincFunction0, goalType0, doubleArray2);
  }
}
