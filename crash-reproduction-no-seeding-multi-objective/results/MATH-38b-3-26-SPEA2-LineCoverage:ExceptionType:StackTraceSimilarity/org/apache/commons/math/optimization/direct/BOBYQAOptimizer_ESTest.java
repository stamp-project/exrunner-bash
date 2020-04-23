/*

 * Tue Apr 21 08:36:18 UTC 2020
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
      int int0 = 17;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(17);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 17;
      double double0 = 0.0;
      doubleArray0[1] = 0.0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(17, sumSincFunction0, goalType0, doubleArray0);
  }
}
