/*

 * Mon Apr 20 09:58:11 UTC 2020
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 5478.183913811161;
      doubleArray0[3] = (-1825.3221567);
      doubleArray0[4] = (-1825.3221567);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 5478.183913811161;
      doubleArray1[1] = 5478.183913811161;
      doubleArray1[2] = (-882.0);
      doubleArray1[3] = 1.232595164407831E-28;
      doubleArray1[4] = 357.017044915622;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (-2448.3160749766766);
      doubleArray2[1] = (-882.0);
      doubleArray2[2] = 2947.013633549557;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 8.094502845779061E-11);
  }
}
