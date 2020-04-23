/*

 * Tue Apr 21 08:32:34 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9, 0.0, (-1433.0));
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-1409);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (-1433.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(305, multivariateFunction0, goalType0, doubleArray0);
  }
}
