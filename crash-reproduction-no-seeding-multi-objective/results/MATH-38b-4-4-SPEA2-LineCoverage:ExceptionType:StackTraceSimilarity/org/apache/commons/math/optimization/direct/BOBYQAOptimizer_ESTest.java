/*

 * Tue Apr 21 08:30:49 UTC 2020
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
      int int0 = 652;
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(101);
      int int1 = 0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0);
      sumSincFunction0.partialDerivative((-1759));
      double[] doubleArray0 = new double[16];
      sumSincFunction0.gradient();
      double double0 = (-3608.266);
      BOBYQAOptimizer bOBYQAOptimizer1 = new BOBYQAOptimizer(81, (-3608.266), 1.1102230246251565E-14);
      // Undeclared exception!
      bOBYQAOptimizer1.optimize(81, sumSincFunction0, goalType0, doubleArray0);
  }
}
