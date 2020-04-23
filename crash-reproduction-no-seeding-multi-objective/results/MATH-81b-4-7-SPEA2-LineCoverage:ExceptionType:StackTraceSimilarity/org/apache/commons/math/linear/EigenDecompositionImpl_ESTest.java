/*

 * Mon Apr 20 09:59:31 UTC 2020
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
      doubleArray0[0] = 2277.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[6] = (-3509.893812609699);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 999.6887039846105;
      doubleArray1[1] = 999.6887039846105;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (-3509.893812609699);
      doubleArray2[1] = 345.0;
      doubleArray2[2] = (-3509.893812609699);
      doubleArray2[3] = 999.6887039846105;
      doubleArray2[4] = (-3509.893812609699);
      doubleArray2[5] = 0.0;
      doubleArray2[6] = (-3509.893812609699);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, (-3509.893812609699));
  }
}
