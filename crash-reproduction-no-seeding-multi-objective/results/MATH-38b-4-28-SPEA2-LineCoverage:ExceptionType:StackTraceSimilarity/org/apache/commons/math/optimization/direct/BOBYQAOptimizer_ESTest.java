/*

 * Tue Apr 21 08:37:58 UTC 2020
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
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[18];
      int int0 = 627;
      int int1 = 236;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(40);
      int int2 = 2222;
      int int3 = 150;
      SumSincFunction sumSincFunction0 = new SumSincFunction(236);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(150, sumSincFunction0, goalType0, doubleArray0);
  }
}
