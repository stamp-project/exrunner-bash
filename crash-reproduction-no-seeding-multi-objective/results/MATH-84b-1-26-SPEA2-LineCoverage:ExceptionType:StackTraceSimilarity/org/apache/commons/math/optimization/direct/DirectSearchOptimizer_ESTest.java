/*

 * Tue Apr 21 10:15:08 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.NelderMead;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 757.7552335874655;
      double double1 = 0.672;
      NelderMead nelderMead0 = new NelderMead(0.672, 757.7552335874655, 1075.184, 1075.184);
      int int0 = 0;
      nelderMead0.setMaxIterations(0);
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker();
      nelderMead0.setConvergenceChecker(simpleRealPointChecker0);
      try { 
        nelderMead0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
