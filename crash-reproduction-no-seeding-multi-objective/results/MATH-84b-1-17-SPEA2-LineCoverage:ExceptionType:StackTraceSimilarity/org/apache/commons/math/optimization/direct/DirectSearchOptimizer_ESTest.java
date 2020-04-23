/*

 * Tue Apr 21 10:15:01 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RealPointValuePair[] realPointValuePairArray0 = new RealPointValuePair[2];
      double[] doubleArray0 = new double[1];
      RealPointValuePair realPointValuePair0 = new RealPointValuePair(doubleArray0, 1000000.0);
      realPointValuePairArray0[0] = realPointValuePair0;
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.incrementIterationsCounter();
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 0.0;
      doubleArray1[4] = 0.0;
      Double double0 = new Double(0.885);
      multiDirectional0.setMaxIterations(1);
      try { 
        multiDirectional0.incrementIterationsCounter();
        fail("Expecting exception: OptimizationException");
      
      } catch(OptimizationException e) {
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (1) exceeded
         //
         verifyException("org.apache.commons.math.optimization.direct.DirectSearchOptimizer", e);
      }
  }
}
