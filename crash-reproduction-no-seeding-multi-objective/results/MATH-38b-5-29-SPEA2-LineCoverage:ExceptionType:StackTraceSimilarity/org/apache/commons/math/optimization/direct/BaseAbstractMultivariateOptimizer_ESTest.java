/*

 * Tue Apr 21 08:36:53 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 47;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(47, 47, 47);
      int int1 = CMAESOptimizer.DEFAULT_MAXITERATIONS;
      double[] doubleArray0 = new double[10];
      int int2 = CMAESOptimizer.DEFAULT_CHECKFEASABLECOUNT;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1398.73559604);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(555, sumSincFunction0, goalType0, doubleArray0);
  }
}
