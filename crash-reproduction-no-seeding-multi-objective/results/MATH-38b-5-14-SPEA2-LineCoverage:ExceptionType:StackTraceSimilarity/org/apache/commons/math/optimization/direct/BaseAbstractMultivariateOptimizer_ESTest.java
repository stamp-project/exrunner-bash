/*

 * Tue Apr 21 08:33:01 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      GoalType goalType0 = GoalType.MAXIMIZE;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[][] doubleArray1 = new double[24][9];
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (double) 78;
      doubleArray1[2] = doubleArray2;
      doubleArray1[3] = doubleArray0;
      int int0 = 8;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(78);
      double double0 = CMAESOptimizer.DEFAULT_STOPFITNESS;
      bOBYQAOptimizer0.getEvaluations();
      SumSincFunction sumSincFunction1 = new SumSincFunction(0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(78, sumSincFunction0, goalType0, doubleArray0);
  }
}
