/*

 * Tue Apr 21 08:37:09 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9);
      SumSincFunction sumSincFunction0 = new SumSincFunction(3019.3169745270916);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1410.205193351);
      doubleArray0[1] = (double) 9;
      doubleArray0[2] = (double) 9;
      sumSincFunction0.value(doubleArray0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(2688, sumSincFunction0, goalType0, doubleArray0);
  }
}
