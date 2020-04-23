/*

 * Tue Apr 21 08:30:27 UTC 2020
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
      int int0 = 34;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(34);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 0.0;
      doubleArray0[1] = (double) 34;
      sumSincFunction0.gradient();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) 36;
      doubleArray1[2] = (double) 36;
      doubleArray1[3] = (double) 147;
      doubleArray1[4] = (double) (-872);
      doubleArray1[5] = (double) (-872);
      doubleArray1[6] = (double) 36;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(36, sumSincFunction0, goalType0, doubleArray1);
  }
}
