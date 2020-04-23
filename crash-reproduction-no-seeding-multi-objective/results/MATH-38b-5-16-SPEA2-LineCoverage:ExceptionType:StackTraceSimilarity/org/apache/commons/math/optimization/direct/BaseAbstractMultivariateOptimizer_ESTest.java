/*

 * Tue Apr 21 08:33:57 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 21;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(21, 342.88064577160355, 342.88064577160355);
      ConvergenceChecker<RealPointValuePair> convergenceChecker0 = bOBYQAOptimizer0.getConvergenceChecker();
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 342.88064577160355;
      SumSincFunction sumSincFunction0 = new SumSincFunction(342.88064577160355);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(21, sumSincFunction0, goalType0, doubleArray0);
  }
}
