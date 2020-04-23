/*

 * Tue Apr 21 08:33:49 UTC 2020
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
      int int0 = 13;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(13);
      double double0 = 0.0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      int int1 = 2;
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(2);
      double[] doubleArray0 = new double[4];
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(13, multivariateFunction0, goalType0, doubleArray0);
  }
}
