/*

 * Tue Apr 21 08:35:23 UTC 2020
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
      int int0 = 276;
      double[] doubleArray0 = new double[19];
      int int1 = 74;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(74, 0.0, 0.0);
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(276);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(592, sumSincFunction0, goalType0, doubleArray0);
  }
}
