/*

 * Tue Apr 21 08:34:36 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(15, (-660.96), (-660.96));
      SumSincFunction sumSincFunction0 = new SumSincFunction((-660.96));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 15;
      sumSincFunction0.gradient();
      doubleArray0[1] = (double) 15;
      doubleArray0[2] = (double) 15;
      doubleArray0[1] = (double) 15;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(15, sumSincFunction0, goalType0, doubleArray0);
  }
}
