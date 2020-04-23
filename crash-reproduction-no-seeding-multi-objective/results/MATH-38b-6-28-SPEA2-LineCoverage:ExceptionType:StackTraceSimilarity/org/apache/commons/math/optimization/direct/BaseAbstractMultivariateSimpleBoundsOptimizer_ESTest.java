/*

 * Tue Apr 21 08:35:53 UTC 2020
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
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-0.4766679631009867);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16, (-0.4766679631009867), 16);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.01);
      SumSincFunction sumSincFunction1 = new SumSincFunction(16);
      sumSincFunction0.partialDerivative((-4605));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 2923;
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.01;
      doubleArray1[2] = (double) 2923;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(16, sumSincFunction1, goalType0, doubleArray1);
  }
}
