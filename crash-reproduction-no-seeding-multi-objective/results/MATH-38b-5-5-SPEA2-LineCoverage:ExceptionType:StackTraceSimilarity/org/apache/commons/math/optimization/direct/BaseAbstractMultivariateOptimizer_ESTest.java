/*

 * Tue Apr 21 08:30:09 UTC 2020
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
      int int0 = 27;
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) (-18);
      int int1 = CMAESOptimizer.DEFAULT_MAXITERATIONS;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[] doubleArray1 = new double[8];
      doubleArray0[5] = (double) 27;
      doubleArray0[6] = (double) (-18);
      doubleArray1[3] = (double) 27;
      doubleArray1[5] = (double) 27;
      double double0 = (-753.84098);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(27, 30000, (-753.84098));
      sumSincFunction0.partialDerivative(27);
      int int2 = 0;
      SumSincFunction sumSincFunction1 = new SumSincFunction(37.5477442);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30000, sumSincFunction1, goalType0, doubleArray1);
  }
}
