/*

 * Mon Apr 20 09:57:28 UTC 2020
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
      doubleArray0[0] = 587.71951533827;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 168.21076499667;
      doubleArray1[1] = 1386.0262357189;
      doubleArray1[2] = (-1766.030858);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 587.71951533827;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.7853981633974483);
  }
}
