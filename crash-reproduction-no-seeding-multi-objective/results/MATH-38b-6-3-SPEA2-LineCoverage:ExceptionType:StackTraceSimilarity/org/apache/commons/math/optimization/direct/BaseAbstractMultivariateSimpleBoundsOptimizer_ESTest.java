/*

 * Tue Apr 21 08:29:06 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConvergenceChecker<RealPointValuePair> convergenceChecker0 = (ConvergenceChecker<RealPointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      ConvergenceChecker<RealPointValuePair> convergenceChecker1 = (ConvergenceChecker<RealPointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      int int0 = 976;
      double double0 = 3554.59540535;
      MultivariateFunction multivariateFunction0 = mock(MultivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)976, 3554.59540535, 3554.59540535, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).when(multivariateFunction0).value(any(double[].class));
      int int1 = 18;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 18;
      doubleArray0[1] = (double) 18;
      doubleArray0[2] = (double) 976;
      doubleArray0[3] = (-814.36466038);
      doubleArray0[4] = (double) 18;
      doubleArray0[5] = (double) 976;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(976, multivariateFunction0, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
