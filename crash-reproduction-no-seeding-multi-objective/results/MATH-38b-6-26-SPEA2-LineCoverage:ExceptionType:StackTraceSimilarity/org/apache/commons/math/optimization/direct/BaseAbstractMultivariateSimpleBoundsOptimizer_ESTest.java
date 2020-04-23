/*

 * Tue Apr 21 08:35:18 UTC 2020
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
      int int0 = (-24);
      int int1 = 15;
      double double0 = 430.2930355431;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(15, 430.2930355431, 15);
      bOBYQAOptimizer0.getEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction((-24));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 2.0;
      doubleArray0[2] = (double) 778;
      doubleArray0[3] = 430.2930355431;
      SumSincFunction sumSincFunction1 = new SumSincFunction(430.2930355431);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 103.0;
      sumSincFunction1.gradient();
      doubleArray1[1] = (double) (-24);
      doubleArray1[2] = (double) (-24);
      doubleArray1[3] = 430.2930355431;
      doubleArray1[4] = 103.0;
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(168, sumSincFunction0, goalType1, doubleArray0);
  }
}
