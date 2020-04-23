/*

 * Tue Apr 21 08:34:34 UTC 2020
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
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      byte byte0 = (byte)0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(25, (byte)0, (byte)0);
      bOBYQAOptimizer0.getMaxEvaluations();
      SumSincFunction sumSincFunction0 = new SumSincFunction(1895);
      GoalType goalType0 = GoalType.MINIMIZE;
      sumSincFunction0.partialDerivative(0);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 1895;
      doubleArray1[2] = (double) 1895;
      doubleArray1[3] = (double) 1895;
      doubleArray1[4] = (double) 25;
      doubleArray1[5] = 0.0;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(540, sumSincFunction0, goalType0, doubleArray1);
  }
}
