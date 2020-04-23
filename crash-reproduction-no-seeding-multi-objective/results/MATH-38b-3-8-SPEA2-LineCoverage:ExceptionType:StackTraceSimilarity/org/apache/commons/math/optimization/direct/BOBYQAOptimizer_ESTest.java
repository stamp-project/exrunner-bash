/*

 * Tue Apr 21 08:31:48 UTC 2020
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
public class BOBYQAOptimizer_ESTest extends BOBYQAOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 12;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12);
      SumSincFunction sumSincFunction0 = new SumSincFunction(1713.8032204736712);
      sumSincFunction0.partialDerivative(12);
      GoalType goalType0 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(12);
      double double0 = (-90.82283671577);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1713.8032204736712;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 12;
      doubleArray1[1] = 1713.8032204736712;
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(680, sumSincFunction0, goalType1, doubleArray0);
  }
}
