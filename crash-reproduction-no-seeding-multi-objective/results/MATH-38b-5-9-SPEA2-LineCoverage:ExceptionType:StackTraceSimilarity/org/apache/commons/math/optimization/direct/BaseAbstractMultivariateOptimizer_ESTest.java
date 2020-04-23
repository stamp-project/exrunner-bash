/*

 * Tue Apr 21 08:31:34 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS;
      double double1 = 3832.9999348956144;
      double[][] doubleArray0 = new double[10][0];
      int int0 = 9;
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker(3832.9999348956144, 9);
      double[] doubleArray1 = new double[3];
      double double2 = BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS;
      doubleArray1[0] = 3832.9999348956144;
      double double3 = BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS;
      int int1 = CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      GoalType goalType0 = GoalType.MINIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(9);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(163, multivariateFunction0, goalType0, doubleArray1);
  }
}
