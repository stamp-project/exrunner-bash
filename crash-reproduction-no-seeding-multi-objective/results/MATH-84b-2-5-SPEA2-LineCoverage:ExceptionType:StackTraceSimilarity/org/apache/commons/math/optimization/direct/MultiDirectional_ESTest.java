/*

 * Tue Apr 21 10:11:56 UTC 2020
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
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[10];
      double[][] doubleArray1 = new double[5][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      MultiDirectional multiDirectional0 = new MultiDirectional((-730.11), (-730.11));
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[3];
      double[] doubleArray2 = new double[1];
      doubleArray2[0] = (-730.11);
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray2, (-1.0));
      multiDirectional0.setMaxIterations((-1));
      realPointValuePairArray0[0] = realPointValuePair0;
      realPointValuePairArray0[1] = realPointValuePair0;
      RealPointValuePair realPointValuePair1 = new RealPointValuePair(doubleArray0, (-467.738355660926), true);
      realPointValuePairArray0[2] = realPointValuePair1;
      multiDirectional0.simplex = realPointValuePairArray0;
      multiDirectional0.getMaxIterations();
      RealConvergenceChecker realConvergenceChecker0 = mock(RealConvergenceChecker.class, new ViolatedAssumptionAnswer());
      multiDirectional0.getMaxIterations();
      Comparator<RealPointValuePair> comparator1 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      try { 
        multiDirectional0.iterateSimplex(comparator1);
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
