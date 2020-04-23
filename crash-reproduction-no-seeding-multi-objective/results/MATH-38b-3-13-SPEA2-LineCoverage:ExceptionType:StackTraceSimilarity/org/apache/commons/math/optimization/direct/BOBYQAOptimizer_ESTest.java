/*

 * Tue Apr 21 08:33:17 UTC 2020
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
      double double0 = 10.0;
      double double1 = (-1022.0093990294278);
      int int0 = 32;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(32);
      SumSincFunction sumSincFunction0 = new SumSincFunction((-1022.0093990294278));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1022.0093990294278);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(32, sumSincFunction0, goalType0, doubleArray0);
  }
}
