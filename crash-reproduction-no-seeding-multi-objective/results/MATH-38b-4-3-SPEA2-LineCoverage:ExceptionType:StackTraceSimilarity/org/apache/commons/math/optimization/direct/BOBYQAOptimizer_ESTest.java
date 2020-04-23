/*

 * Tue Apr 21 08:29:50 UTC 2020
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
      double[] doubleArray0 = new double[5];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(10);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(25);
      SumSincFunction sumSincFunction0 = new SumSincFunction(25);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-4290.416319392396);
      doubleArray1[1] = 2160.3115595;
      doubleArray1[2] = 903.128283;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(43, sumSincFunction0, goalType0, doubleArray1);
  }
}
