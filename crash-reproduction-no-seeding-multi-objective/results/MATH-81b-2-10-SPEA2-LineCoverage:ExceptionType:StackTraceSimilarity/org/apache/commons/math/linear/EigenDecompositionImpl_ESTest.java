/*

 * Mon Apr 20 09:57:57 UTC 2020
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
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1077.814);
      doubleArray0[1] = 1076.287660394;
      double double0 = (-0.02102887555365307);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 0.9999999999999998;
      doubleArray1[2] = 1076.287660394;
      doubleArray1[3] = 1.0E-13;
      doubleArray1[4] = 2160.0;
      doubleArray1[5] = 2160.0;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = 2160.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}
