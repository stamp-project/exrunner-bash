/*

 * Tue Apr 21 10:13:38 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MultiDirectional_ESTest extends MultiDirectional_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.getEvaluations();
      RealConvergenceChecker realConvergenceChecker0 = multiDirectional0.getConvergenceChecker();
      multiDirectional0.getConvergenceChecker();
      multiDirectional0.getMaxIterations();
      multiDirectional0.setMaxEvaluations(Integer.MAX_VALUE);
      multiDirectional0.incrementIterationsCounter();
      multiDirectional0.setConvergenceChecker(realConvergenceChecker0);
      MultiDirectional multiDirectional1 = new MultiDirectional();
      multiDirectional1.getMaxIterations();
      multiDirectional1.setConvergenceChecker(realConvergenceChecker0);
      multiDirectional0.getConvergenceChecker();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) Integer.MAX_VALUE;
      doubleArray0[1] = (double) Integer.MAX_VALUE;
      multiDirectional1.setStartConfiguration(doubleArray0);
      multiDirectional0.setMaxIterations(0);
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      try { 
        multiDirectional0.iterateSimplex(comparator0);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
