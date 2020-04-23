/*

 * Tue Apr 21 08:34:41 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(32, 32, 32);
      SumSincFunction sumSincFunction0 = new SumSincFunction(32);
      sumSincFunction0.partialDerivative(210);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 32;
      doubleArray0[1] = (double) 32;
      doubleArray0[2] = (double) 210;
      doubleArray0[3] = (double) 210;
      doubleArray0[4] = (double) 210;
      sumSincFunction0.gradient();
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer((-1287), (-20.468871), 64.0);
      sumSincFunction0.value(doubleArray0);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-2071.8835270391));
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(129, sumSincFunction0, goalType0, doubleArray0);
  }
}
