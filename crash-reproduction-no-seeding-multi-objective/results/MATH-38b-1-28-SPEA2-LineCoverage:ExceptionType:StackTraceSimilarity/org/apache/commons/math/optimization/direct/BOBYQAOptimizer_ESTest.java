/*

 * Tue Apr 21 08:36:54 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction((-50.15472598128595));
      SumSincFunction sumSincFunction1 = new SumSincFunction((-50.15472598128595));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-50.15472598128595);
      doubleArray0[1] = (double) 30;
      doubleArray0[2] = (-50.15472598128595);
      doubleArray0[2] = (-50.15472598128595);
      doubleArray0[4] = (double) 30;
      doubleArray0[5] = (-50.15472598128595);
      doubleArray0[6] = (-50.15472598128595);
      doubleArray0[4] = (double) 30;
      doubleArray0[8] = (-50.15472598128595);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction1, goalType0, doubleArray0);
  }
}
