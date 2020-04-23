/*

 * Tue Apr 21 08:32:52 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30);
      SumSincFunction sumSincFunction0 = new SumSincFunction(30);
      double[] doubleArray0 = new double[7];
      double double0 = BOBYQAOptimizer.DEFAULT_INITIAL_RADIUS;
      doubleArray0[0] = (double) 30;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 30;
      doubleArray1[1] = 10.0;
      sumSincFunction0.gradient();
      doubleArray1[2] = 10.0;
      doubleArray1[3] = (double) 30;
      sumSincFunction0.value(doubleArray1);
      doubleArray0[1] = (double) 30;
      doubleArray0[2] = (double) (-676);
      doubleArray0[3] = (double) (-676);
      doubleArray0[4] = (double) 30;
      doubleArray0[5] = (-676.0);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(17);
      SumSincFunction sumSincFunction1 = new SumSincFunction(17);
      sumSincFunction0.value(doubleArray0);
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(720);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }
}
