/*

 * Mon Apr 20 10:03:04 UTC 2020
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
      doubleArray0[0] = 4319.4705614;
      doubleArray0[1] = 4319.4705614;
      doubleArray0[0] = 4319.4705614;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1783.161);
      doubleArray1[1] = 5.549513755971004;
      doubleArray1[2] = 4827.65;
      doubleArray1[3] = 4319.4705614;
      doubleArray1[4] = 5.549513755971004;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.7620167057920774E-25);
  }
}
