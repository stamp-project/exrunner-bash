/*

 * Tue Apr 21 08:34:13 UTC 2020
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
      int int0 = 246;
      int int1 = 1097;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(1097);
      double double0 = (-2208.1950152468);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2208.1950152468));
      int int2 = 10;
      double double1 = (-714.07840876096);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(10, (-714.07840876096), (-966.3975441719));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-966.3975441719);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-714.07840876096);
      doubleArray1[1] = (double) 10;
      doubleArray1[2] = (-2208.1950152468);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-2208.1950152468);
      doubleArray2[1] = (-2208.1950152468);
      doubleArray2[2] = (double) 1097;
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(10, sumSincFunction0, goalType0, doubleArray2);
  }
}
