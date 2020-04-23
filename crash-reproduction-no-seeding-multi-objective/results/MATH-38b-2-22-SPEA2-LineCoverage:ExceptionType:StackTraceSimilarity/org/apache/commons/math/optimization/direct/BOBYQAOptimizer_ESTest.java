/*

 * Tue Apr 21 08:35:15 UTC 2020
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
      int int0 = 38;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(38);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(38);
      int int1 = 360;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-78);
      doubleArray0[1] = (-772.8753960549702);
      doubleArray0[2] = (double) 38;
      doubleArray0[3] = 0.0;
      SumSincFunction sumSincFunction1 = new SumSincFunction(38);
      sumSincFunction1.gradient();
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(19, sumSincFunction1, goalType0, doubleArray0);
  }
}
