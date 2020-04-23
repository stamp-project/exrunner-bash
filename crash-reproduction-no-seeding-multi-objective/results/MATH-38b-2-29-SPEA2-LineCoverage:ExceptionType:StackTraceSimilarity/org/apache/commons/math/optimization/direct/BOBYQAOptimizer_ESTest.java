/*

 * Tue Apr 21 08:37:15 UTC 2020
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
      int int0 = 19;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(19, 0.0, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.001);
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = 0.001;
      doubleArray0[2] = 0.001;
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(19, sumSincFunction0, goalType0, doubleArray0);
  }
}
