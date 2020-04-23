/*

 * Mon Apr 20 10:01:54 UTC 2020
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
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 2425.958;
      doubleArray1[1] = 1631.3115698880772;
      doubleArray1[2] = (-3424.1535743);
      doubleArray1[3] = 2.0779220779220777;
      doubleArray1[4] = 2027.24898;
      doubleArray1[5] = (-1795.232919);
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 2425.958;
      doubleArray2[2] = 2.0779220779220777;
      doubleArray2[3] = 2425.958;
      doubleArray2[4] = 2027.24898;
      doubleArray2[5] = 2.2250738585072014E-308;
      doubleArray2[6] = (-3424.1535743);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, 2027.24898);
  }
}
