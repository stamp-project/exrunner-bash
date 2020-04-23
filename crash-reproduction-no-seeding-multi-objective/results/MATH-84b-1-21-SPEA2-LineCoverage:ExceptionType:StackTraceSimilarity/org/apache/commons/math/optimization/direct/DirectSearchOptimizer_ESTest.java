/*

 * Tue Apr 21 10:14:28 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      int int0 = (-211);
      nelderMead0.setMaxIterations((-211));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      double double0 = 1942.0835651569287;
      double double1 = (-1422.5);
      SimpleScalarValueChecker simpleScalarValueChecker0 = new SimpleScalarValueChecker(0.0, (-1422.5));
      nelderMead0.setConvergenceChecker(simpleScalarValueChecker0);
      doubleArray0[1] = 1942.0835651569287;
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-211) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
