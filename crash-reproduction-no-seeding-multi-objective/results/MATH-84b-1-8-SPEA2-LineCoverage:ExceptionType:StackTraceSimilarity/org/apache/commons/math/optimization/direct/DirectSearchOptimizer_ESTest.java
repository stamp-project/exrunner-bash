/*

 * Tue Apr 21 10:12:35 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleRealPointChecker;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      SimpleRealPointChecker simpleRealPointChecker0 = new SimpleRealPointChecker();
      double[][] doubleArray0 = new double[8][4];
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = (-70.93192180205395);
      double[] doubleArray2 = new double[2];
      doubleArray2[1] = (double) 0;
      double[] doubleArray3 = new double[10];
      doubleArray3[3] = 2279.4732492020844;
      double[] doubleArray4 = new double[0];
      doubleArray0[6] = doubleArray1;
      doubleArray0[7] = doubleArray1;
      double[] doubleArray5 = new double[0];
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.getIterations();
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[4];
      multiDirectional0.simplex = realPointValuePairArray0;
      multiDirectional0.setMaxIterations(0);
      try { 
        multiDirectional0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
