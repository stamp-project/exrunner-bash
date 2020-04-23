/*

 * Tue Apr 21 08:37:12 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[8];
      int int0 = 29;
      int int1 = 0;
      double double0 = (-1850.199112454253);
      int int2 = 1094;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(29);
      double double1 = 696.513636;
      SumSincFunction sumSincFunction0 = new SumSincFunction(696.513636);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(29, sumSincFunction0, goalType0, doubleArray0);
  }
}
