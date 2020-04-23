/*

 * Tue Apr 21 08:32:29 UTC 2020
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
      int int0 = 55;
      double double0 = 414.0;
      double double1 = 0.9987627507929089;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(55, 414.0, 0.9987627507929089);
      SumSincFunction sumSincFunction0 = new SumSincFunction(0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.9987627507929089;
      doubleArray0[1] = 0.9987627507929089;
      int int1 = 36;
      GoalType goalType1 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(36, sumSincFunction0, goalType1, doubleArray0);
  }
}
