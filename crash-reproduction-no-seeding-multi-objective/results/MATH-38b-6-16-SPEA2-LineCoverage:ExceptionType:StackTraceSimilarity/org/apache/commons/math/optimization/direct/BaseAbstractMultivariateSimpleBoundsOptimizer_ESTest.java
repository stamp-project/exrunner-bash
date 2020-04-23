/*

 * Tue Apr 21 08:32:54 UTC 2020
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
      double[] doubleArray0 = new double[3];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(8);
      int int0 = 415;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(8, (-1668.644), (-736.918911377054));
      bOBYQAOptimizer1.getEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(1107.3539008354887);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-2054.9494));
      SumSincFunction sumSincFunction2 = new SumSincFunction(1107.3539008354887);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(8, sumSincFunction2, goalType0, doubleArray0);
  }
}
