/*

 * Mon Apr 20 10:08:14 UTC 2020
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
      int int0 = 2068;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 2068;
      double double0 = 2572.44230862;
      doubleArray1[2] = 2572.44230862;
      doubleArray1[2] = (double) 2068;
      doubleArray1[3] = (double) 2068;
      doubleArray1[4] = 56.1233082582539;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 1.2576812912494537E-10;
      doubleArray2[1] = 2572.44230862;
      doubleArray2[2] = (double) 2068;
      doubleArray2[3] = (double) 2068;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 1.2576812912494537E-10);
  }
}
