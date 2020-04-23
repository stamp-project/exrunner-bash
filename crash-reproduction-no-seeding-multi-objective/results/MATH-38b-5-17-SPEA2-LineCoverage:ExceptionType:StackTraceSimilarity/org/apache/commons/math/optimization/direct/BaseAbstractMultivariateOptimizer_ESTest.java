/*

 * Tue Apr 21 08:33:52 UTC 2020
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
      int int0 = 0;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 14;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[3] = (double) 0;
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[23];
      doubleArray1[2] = (double) 0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(14);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      sumSincFunction0.partialDerivative(0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(14, sumSincFunction0, goalType0, doubleArray0);
  }
}
