/*

 * Tue Apr 21 08:33:07 UTC 2020
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
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2434.0), (-2434.0), (-2.0), 2301.5555, (-2.0)).when(multivariateFunction0).value(any(double[].class));
      double[] doubleArray0 = new double[4];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(11);
      int int0 = 726;
      bOBYQAOptimizer0.getEvaluations();
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 11;
      doubleArray1[2] = (double) 11;
      doubleArray0[0] = (double) 11;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(726, multivariateFunction0, goalType0, doubleArray0);
  }
}
