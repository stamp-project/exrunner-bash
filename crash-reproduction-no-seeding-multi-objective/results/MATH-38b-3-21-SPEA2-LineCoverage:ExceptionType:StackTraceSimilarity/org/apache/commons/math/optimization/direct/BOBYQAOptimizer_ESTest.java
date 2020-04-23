/*

 * Tue Apr 21 08:35:02 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(9, (-1240.0), 9);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      sumSincFunction0.partialDerivative(9);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[5];
      int int0 = 50;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-3553.226);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(50, sumSincFunction0, goalType0, doubleArray1);
  }
}
