/*

 * Tue Apr 21 08:32:59 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker();
      ConvergenceChecker<RealPointValuePair> convergenceChecker0 = (ConvergenceChecker<RealPointValuePair>) mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      SumSincFunction sumSincFunction0 = new SumSincFunction(2147483621);
      double[] doubleArray0 = new double[10];
      doubleArray0[2] = (double) 2147483621;
      sumSincFunction0.gradient();
      doubleArray0[0] = (double) 2147483621;
      double double0 = BOBYQAOptimizer.DEFAULT_STOPPING_RADIUS;
      sumSincFunction0.gradient();
      SumSincFunction sumSincFunction1 = new SumSincFunction(1.0E-8);
      int int0 = 0;
      SumSincFunction sumSincFunction2 = new SumSincFunction(0.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray1 = new double[4];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(24, 0.0, 0.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(2147483621, sumSincFunction2, goalType0, doubleArray0);
  }
}
