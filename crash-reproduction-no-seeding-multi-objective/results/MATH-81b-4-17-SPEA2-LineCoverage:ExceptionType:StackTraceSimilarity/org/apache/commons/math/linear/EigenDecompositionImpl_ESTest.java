/*

 * Mon Apr 20 10:01:43 UTC 2020
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
      doubleArray0[1] = 0.9999999999999998;
      double double0 = 1.5;
      doubleArray0[2] = 1.5;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1010.5018694982923);
      doubleArray0[5] = (-3527.92891);
      doubleArray0[6] = (-1010.5018694982923);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-1358.92);
      doubleArray1[1] = (-1358.92);
      doubleArray1[3] = 1.5;
      doubleArray1[4] = (-3057.85);
      doubleArray1[5] = 5284.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1358.92));
  }
}
