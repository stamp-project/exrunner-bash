/*

 * Tue Apr 21 08:36:03 UTC 2020
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
      int int0 = 51;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(51, 51, 51);
      GoalType goalType0 = GoalType.MINIMIZE;
      double double0 = CMAESOptimizer.DEFAULT_STOPFITNESS;
      bOBYQAOptimizer0.getMaxEvaluations();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 51;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(51, sumSincFunction0, goalType0, doubleArray0);
  }
}
