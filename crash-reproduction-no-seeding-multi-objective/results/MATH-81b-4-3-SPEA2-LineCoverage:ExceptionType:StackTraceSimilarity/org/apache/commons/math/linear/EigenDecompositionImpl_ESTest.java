/*

 * Mon Apr 20 09:56:12 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = (-242.60626);
      doubleArray0[0] = (-242.60626);
      double double1 = (-3862.1744698838147);
      doubleArray0[1] = (-242.60626);
      double double2 = (-164.6822358236);
      double double3 = -0.0;
      double double4 = 152.9;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-242.60626);
      doubleArray1[1] = 2062.865690239962;
      doubleArray1[2] = (-3862.1744698838147);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-164.6822358236));
  }
}
