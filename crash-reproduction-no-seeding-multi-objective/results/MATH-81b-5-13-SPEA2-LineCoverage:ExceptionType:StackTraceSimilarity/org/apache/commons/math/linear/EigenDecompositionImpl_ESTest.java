/*

 * Mon Apr 20 10:00:11 UTC 2020
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
      double double0 = 0.333;
      doubleArray0[0] = 0.333;
      int int0 = 4256;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.333;
      doubleArray1[1] = 0.333;
      doubleArray1[2] = (-3403.9057);
      doubleArray1[3] = 0.333;
      doubleArray1[4] = 0.333;
      doubleArray1[5] = (double) 4256;
      doubleArray1[6] = (double) 4256;
      doubleArray1[7] = (double) 4256;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.333);
  }
}
