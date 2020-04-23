/*

 * Tue Apr 21 08:30:12 UTC 2020
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
      int int0 = 30;
      double double0 = (-4940.5032);
      double double1 = (-1262.5248633771635);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, (-4940.5032), (-1262.5248633771635));
      SumSincFunction sumSincFunction0 = new SumSincFunction(Double.POSITIVE_INFINITY);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-4940.5032);
      doubleArray0[1] = (-4940.5032);
      doubleArray0[2] = Double.POSITIVE_INFINITY;
      doubleArray0[3] = (-1262.5248633771635);
      doubleArray0[4] = (-579.0);
      doubleArray0[5] = (double) 30;
      doubleArray0[6] = (-1262.5248633771635);
      doubleArray0[7] = (-4940.5032);
      doubleArray0[8] = (double) 30;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }
}
