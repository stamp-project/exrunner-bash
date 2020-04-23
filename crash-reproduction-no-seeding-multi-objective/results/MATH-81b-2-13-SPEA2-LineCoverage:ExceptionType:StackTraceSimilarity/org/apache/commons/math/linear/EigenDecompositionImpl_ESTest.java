/*

 * Mon Apr 20 10:01:59 UTC 2020
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
      doubleArray1[0] = 255.6460531;
      doubleArray1[1] = 495.4796392166632;
      doubleArray1[3] = (-2566.333);
      doubleArray1[4] = 0.563;
      doubleArray1[5] = 495.4796392166632;
      doubleArray1[6] = 495.4796392166632;
      doubleArray1[7] = 495.4796392166632;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (-875.111291);
      doubleArray2[1] = (-875.111291);
      doubleArray2[2] = 0.563;
      doubleArray2[3] = 2479.7;
      doubleArray2[4] = 255.6460531;
      doubleArray2[5] = (-2152.6940176373105);
      doubleArray2[6] = 4014.1484251;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, (-875.111291));
  }
}
