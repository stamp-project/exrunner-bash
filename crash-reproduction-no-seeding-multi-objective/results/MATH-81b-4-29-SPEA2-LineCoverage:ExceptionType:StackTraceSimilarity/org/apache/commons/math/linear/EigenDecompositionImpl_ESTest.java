/*

 * Mon Apr 20 10:09:51 UTC 2020
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
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 537.8985;
      doubleArray0[1] = (-2530.0039611921075);
      doubleArray0[2] = (-2530.0039611921075);
      doubleArray0[3] = 1.09861228866811;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1.09861228866811;
      doubleArray1[1] = 537.8985;
      doubleArray1[2] = 537.8985;
      doubleArray1[3] = (-2530.0039611921075);
      doubleArray1[4] = (-2530.0039611921075);
      doubleArray1[5] = (-1859.5);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 0.5);
  }
}
