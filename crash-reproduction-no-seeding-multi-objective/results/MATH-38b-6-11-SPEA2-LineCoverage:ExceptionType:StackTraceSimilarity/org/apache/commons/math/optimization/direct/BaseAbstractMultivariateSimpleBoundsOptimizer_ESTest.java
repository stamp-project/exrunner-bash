/*

 * Tue Apr 21 08:31:26 UTC 2020
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
      int int0 = 180;
      double double0 = 441.98856;
      SumSincFunction sumSincFunction0 = new SumSincFunction(180);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-62.4);
      doubleArray0[1] = (-62.4);
      doubleArray0[2] = 1756.359421;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(180, sumSincFunction0, goalType0, doubleArray0);
  }
}
