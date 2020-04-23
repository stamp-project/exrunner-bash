/*

 * Tue Apr 21 08:31:16 UTC 2020
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
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(8, 0.0, 8);
      SumSincFunction sumSincFunction0 = new SumSincFunction(8);
      sumSincFunction0.partialDerivative(8);
      double[] doubleArray0 = new double[3];
      SumSincFunction sumSincFunction1 = new SumSincFunction((-4507.0));
      int int1 = (-2266);
      sumSincFunction0.partialDerivative((-2266));
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(8, sumSincFunction1, goalType0, doubleArray0);
  }
}
