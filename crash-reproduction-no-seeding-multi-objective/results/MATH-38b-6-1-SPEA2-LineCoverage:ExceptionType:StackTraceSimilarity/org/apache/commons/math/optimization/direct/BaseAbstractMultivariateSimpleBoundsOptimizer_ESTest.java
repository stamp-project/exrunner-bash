/*

 * Tue Apr 21 08:28:27 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(13);
      SumSincFunction sumSincFunction0 = new SumSincFunction(13);
      sumSincFunction0.partialDerivative(7);
      SumSincFunction sumSincFunction1 = new SumSincFunction((-1.0));
      GoalType goalType0 = GoalType.MINIMIZE;
      bOBYQAOptimizer0.getMaxEvaluations();
      int int0 = 23;
      sumSincFunction0.partialDerivative(13);
      SumSincFunction sumSincFunction2 = new SumSincFunction((-1.0));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 13;
      doubleArray0[1] = 269.4600615719367;
      doubleArray0[2] = (double) (-192);
      doubleArray0[3] = (double) (-192);
      doubleArray0[4] = (double) 7;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(Integer.MAX_VALUE, sumSincFunction2, goalType0, doubleArray0);
  }
}
