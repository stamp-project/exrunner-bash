/*

 * Mon Apr 20 10:06:17 UTC 2020
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
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2396.8215352538);
      doubleArray0[3] = 165.753812;
      doubleArray0[4] = (-2859.99);
      doubleArray0[5] = 2096.407289936877;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 1.05;
      doubleArray0[8] = (-667.9408175060881);
      double[] doubleArray1 = new double[8];
      doubleArray1[2] = 165.753812;
      doubleArray1[3] = 2073.286;
      doubleArray1[4] = (-0.1425465430742778);
      doubleArray1[5] = 2073.286;
      doubleArray1[6] = (-2859.99);
      doubleArray1[7] = 2096.407289936877;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2859.99));
  }
}
