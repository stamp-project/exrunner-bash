/*

 * Tue Apr 21 08:34:26 UTC 2020
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
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[8];
      double double0 = 1648.0;
      int int0 = 36;
      double double1 = (-2578.9340925801716);
      double double2 = (-2316.823400352);
      int int1 = 36;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(36);
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(1648.0);
      int int2 = 3337;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(3337, sumSincFunction0, goalType0, doubleArray0);
  }
}
