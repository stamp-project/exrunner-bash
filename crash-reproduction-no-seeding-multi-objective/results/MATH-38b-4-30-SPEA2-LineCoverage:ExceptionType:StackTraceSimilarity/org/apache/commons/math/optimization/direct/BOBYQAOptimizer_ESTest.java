/*

 * Tue Apr 21 08:37:17 UTC 2020
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
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-224.75959728883);
      doubleArray0[1] = (-224.75959728883);
      doubleArray0[2] = (-776.8);
      doubleArray0[4] = 46.7458577;
      doubleArray0[4] = 127.2321438745574;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (-776.8);
      sumSincFunction0.value(doubleArray0);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(23);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-224.75959728883);
      doubleArray1[2] = 250.0;
      doubleArray1[3] = (-224.75959728883);
      doubleArray1[4] = (double) 23;
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-224.75959728883);
      doubleArray1[7] = (-776.8);
      doubleArray1[8] = 46.7458577;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(23, sumSincFunction0, goalType0, doubleArray1);
  }
}
