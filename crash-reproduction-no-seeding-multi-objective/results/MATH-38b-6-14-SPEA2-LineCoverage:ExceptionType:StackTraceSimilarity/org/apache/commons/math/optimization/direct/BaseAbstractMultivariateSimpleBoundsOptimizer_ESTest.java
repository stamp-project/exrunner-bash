/*

 * Tue Apr 21 08:32:29 UTC 2020
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
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(16);
      int int0 = 59;
      SumSincFunction sumSincFunction0 = new SumSincFunction(7.0);
      sumSincFunction0.partialDerivative(16);
      double[] doubleArray0 = new double[6];
      sumSincFunction0.value(doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 7.0;
      doubleArray1[1] = (double) 16;
      doubleArray1[2] = 2201.44822772963;
      SumSincFunction sumSincFunction1 = new SumSincFunction(2201.44822772963);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(16, 236.0, 59);
      bOBYQAOptimizer1.getEvaluations();
      double[] doubleArray2 = null;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(25, (MultivariateFunction) sumSincFunction0, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
