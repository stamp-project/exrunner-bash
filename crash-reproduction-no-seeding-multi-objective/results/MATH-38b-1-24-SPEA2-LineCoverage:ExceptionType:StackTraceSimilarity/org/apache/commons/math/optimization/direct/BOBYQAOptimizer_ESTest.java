/*

 * Tue Apr 21 08:35:43 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(55, 10.0, (-2140.21171153235));
      SumSincFunction sumSincFunction0 = new SumSincFunction(55);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 1.0E-4;
      doubleArray0[2] = 1594.39877;
      doubleArray0[3] = 10.0;
      doubleArray0[4] = (double) (-813);
      doubleArray0[5] = 10.0;
      doubleArray0[6] = (-2140.21171153235);
      doubleArray0[7] = (double) (-813);
      doubleArray0[8] = (double) (-813);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(55, sumSincFunction0, goalType0, doubleArray0);
  }
}
