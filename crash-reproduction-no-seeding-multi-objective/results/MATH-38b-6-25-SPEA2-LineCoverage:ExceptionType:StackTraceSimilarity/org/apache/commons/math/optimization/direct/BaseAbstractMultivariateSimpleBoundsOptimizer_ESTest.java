/*

 * Tue Apr 21 08:35:08 UTC 2020
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
      double double0 = (-49.6376670106167);
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-49.6376670106167), (double)6, (-1056.37882006), (-1993.00263509), (-3373.0391203475)).when(multivariateFunction0).value(any(double[].class));
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(8, 6, 0.0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 8;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(3938, multivariateFunction0, goalType0, doubleArray0);
  }
}
