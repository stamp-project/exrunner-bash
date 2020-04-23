/*

 * Tue Apr 21 08:34:07 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.optimization.direct.CMAESOptimizer;
import org.apache.commons.math.random.MersenneTwister;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateOptimizer_ESTest extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte byte0 = (byte)23;
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double0 = 0.0;
      double[][] doubleArray0 = new double[8][9];
      doubleArray0[3] = doubleArray0[1];
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer((byte)23, 60.473574250830325, 925.0575370826981);
      bOBYQAOptimizer0.getEvaluations();
      int int0 = CMAESOptimizer.DEFAULT_MAXITERATIONS;
      SumSincFunction sumSincFunction0 = new SumSincFunction(1647.3641995);
      sumSincFunction0.value(doubleArray0[3]);
      sumSincFunction0.value(doubleArray0[3]);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(1970, sumSincFunction0, goalType0, doubleArray0[6]);
  }
}
