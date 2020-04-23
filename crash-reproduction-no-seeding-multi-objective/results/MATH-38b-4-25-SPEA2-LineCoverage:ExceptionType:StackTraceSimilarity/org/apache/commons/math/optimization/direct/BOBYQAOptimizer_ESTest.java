/*

 * Tue Apr 21 08:36:05 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18, 18, 130.1603023381);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(28);
      SumSincFunction sumSincFunction0 = new SumSincFunction(28);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 23;
      doubleArray0[2] = (double) 28;
      doubleArray0[3] = (-611.9588979045342);
      BOBYQAOptimizer bOBYQAOptimizer2 = new BOBYQAOptimizer(230, (-52.43878848787201), 36.0);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(4775, sumSincFunction0, goalType0, doubleArray0);
  }
}
