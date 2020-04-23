/*

 * Mon Apr 20 09:56:15 UTC 2020
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
      doubleArray0[0] = (-1942.4449643);
      doubleArray0[1] = (-3008.06568);
      doubleArray0[3] = 0.333;
      doubleArray0[4] = -0.0;
      doubleArray0[5] = 3493.8276;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 0.333;
      doubleArray1[1] = (-3008.06568);
      doubleArray1[2] = 3493.8276;
      doubleArray1[3] = (-1942.4449643);
      doubleArray1[4] = 0.333;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, -0.0);
  }
}
