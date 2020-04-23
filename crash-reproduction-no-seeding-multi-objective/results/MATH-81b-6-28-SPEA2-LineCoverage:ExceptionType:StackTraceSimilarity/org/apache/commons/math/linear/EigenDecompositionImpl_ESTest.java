/*

 * Mon Apr 20 10:07:12 UTC 2020
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
      doubleArray0[0] = 2.2250738585072014E-308;
      doubleArray0[1] = (-2778.9429);
      doubleArray0[2] = (-1300.6037822714545);
      doubleArray0[3] = 18.0;
      doubleArray0[4] = (-2778.9429);
      doubleArray0[5] = (double) 2147483254;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-1300.6037822714545);
      doubleArray1[1] = (-1326.10311);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (double) 2147483254;
      doubleArray1[4] = (-1326.10311);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2778.9429));
  }
}
