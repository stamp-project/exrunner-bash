/*

 * Tue Apr 21 08:32:33 UTC 2020
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
      int int0 = 18;
      int int1 = 1328;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18, 18, 18);
      int int2 = 0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(18);
      sumSincFunction0.gradient();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 4.293620869258453E210;
      doubleArray0[2] = (double) 0;
      doubleArray0[2] = (double) 1328;
      doubleArray0[4] = (double) 1328;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(18, sumSincFunction0, goalType0, doubleArray0);
  }
}
