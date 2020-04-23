/*

 * Tue Apr 21 08:34:43 UTC 2020
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
      int int0 = 16;
      double[] doubleArray0 = new double[6];
      double double0 = 2128.652320197009;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16, 16, 2128.652320197009);
      SumSincFunction sumSincFunction0 = new SumSincFunction(2128.652320197009);
      sumSincFunction0.partialDerivative(0);
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(16, sumSincFunction0, goalType0, doubleArray0);
  }
}
