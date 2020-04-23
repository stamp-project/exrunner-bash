/*

 * Tue Apr 21 08:32:20 UTC 2020
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
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(18);
      double[] doubleArray0 = new double[14];
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      SumSincFunction sumSincFunction1 = new SumSincFunction(18);
      sumSincFunction1.value(doubleArray0);
      double[] doubleArray1 = new double[5];
      double double0 = (-0.11089511480266884);
      sumSincFunction0.gradient();
      doubleArray1[0] = (-0.11089511480266884);
      SumSincFunction sumSincFunction2 = new SumSincFunction(14.997950163465196);
      SumSincFunction sumSincFunction3 = new SumSincFunction(1.5);
      sumSincFunction0.value(doubleArray1);
      SumSincFunction sumSincFunction4 = new SumSincFunction((-4055.0512201));
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(18, sumSincFunction4, goalType0, doubleArray1);
  }
}
