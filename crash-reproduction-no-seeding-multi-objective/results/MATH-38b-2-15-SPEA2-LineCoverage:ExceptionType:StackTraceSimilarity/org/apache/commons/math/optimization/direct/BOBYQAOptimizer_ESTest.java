/*

 * Tue Apr 21 08:33:53 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(62);
      bOBYQAOptimizer0.getGoalType();
      int int0 = 102;
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(409.527, (-1654.9), (-1204.7941153531), 1.1848494749324854, (-2663.33144643051)).when(multivariateFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 102;
      doubleArray0[1] = (double) 102;
      double double0 = (-145.6);
      doubleArray0[2] = (-145.6);
      doubleArray0[3] = (double) 102;
      doubleArray0[4] = (double) 102;
      doubleArray0[5] = (double) 62;
      doubleArray0[6] = (double) 102;
      doubleArray0[7] = (double) 62;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(102, multivariateFunction0, goalType0, doubleArray0);
  }
}
