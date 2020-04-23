/*

 * Mon Apr 20 09:54:22 UTC 2020
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
      doubleArray0[0] = 0.5;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2493.0);
      doubleArray0[1] = 1.1102230246251565E-16;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 4.0;
      doubleArray0[7] = 1162.35025;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 722.7928;
      doubleArray1[2] = 1.1102230246251565E-16;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 0.5;
      doubleArray1[5] = 1.732050807568877;
      doubleArray1[6] = 1162.35025;
      doubleArray1[7] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.5);
  }
}
