/*

 * Tue Apr 21 08:32:40 UTC 2020
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
      int int0 = 62;
      double double0 = 0.0;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(15, 36.645677195, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-3014.7296433053907));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 36.645677195;
      doubleArray0[2] = (-3014.7296433053907);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(62, sumSincFunction0, goalType0, doubleArray0);
  }
}
