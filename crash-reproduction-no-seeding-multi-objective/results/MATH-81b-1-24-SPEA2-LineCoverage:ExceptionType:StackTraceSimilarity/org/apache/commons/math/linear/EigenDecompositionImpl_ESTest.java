/*

 * Mon Apr 20 10:04:51 UTC 2020
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
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1041.1053);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2444.371851195);
      doubleArray0[3] = 0.25;
      doubleArray0[4] = (-1549.035);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (-1549.035);
      doubleArray1[2] = 6.38905609893065;
      doubleArray1[3] = 0.0;
      doubleArray0[1] = 2.0779220779220777;
      doubleArray1[5] = (-1549.035);
      doubleArray1[6] = 0.25;
      doubleArray1[7] = (-1549.035);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 0.0);
  }
}
