/*

 * Tue Apr 21 08:35:40 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(647.2452);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 647.2452;
      doubleArray0[0] = 647.2452;
      doubleArray0[2] = 647.2452;
      doubleArray0[3] = 647.2452;
      SumSincFunction sumSincFunction1 = new SumSincFunction(647.2452);
      sumSincFunction0.gradient();
      SumSincFunction sumSincFunction2 = new SumSincFunction(1190.57857);
      sumSincFunction2.partialDerivative(179);
      sumSincFunction1.gradient();
      SumSincFunction sumSincFunction3 = new SumSincFunction(0.125);
      sumSincFunction3.partialDerivative(1);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(24);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(179, (MultivariateFunction) sumSincFunction1, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
