/*

 * Tue Apr 21 08:35:39 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(190);
      int int0 = 15;
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(15);
      int int1 = (-444);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-84.669773446));
      SumSincFunction sumSincFunction1 = new SumSincFunction(190);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 57;
      doubleArray0[4] = (-84.669773446);
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(15, sumSincFunction1, goalType0, doubleArray0);
  }
}
