/*

 * Tue Apr 21 08:29:38 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(36);
      double[] doubleArray0 = new double[7];
      SumSincFunction sumSincFunction0 = new SumSincFunction(125.86378);
      SumSincFunction sumSincFunction1 = new SumSincFunction(0.125);
      sumSincFunction1.value(doubleArray0);
      sumSincFunction0.gradient();
      sumSincFunction0.value(doubleArray0);
      sumSincFunction0.partialDerivative(36);
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      sumSincFunction1.partialDerivative(36);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(36, (MultivariateFunction) sumSincFunction0, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
