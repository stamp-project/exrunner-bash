/*

 * Tue Apr 21 08:30:01 UTC 2020
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
      int int0 = 247;
      double double0 = (-1580.5951915084456);
      double[] doubleArray0 = new double[7];
      int int1 = 18;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18);
      bOBYQAOptimizer0.getEvaluations();
      double double1 = 3486.84129108;
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1580.5951915084456));
      sumSincFunction0.gradient();
      SumSincFunction sumSincFunction1 = new SumSincFunction(247);
      sumSincFunction0.gradient();
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(18, sumSincFunction0, goalType0, doubleArray0);
  }
}
