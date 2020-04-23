/*

 * Mon Apr 20 10:00:59 UTC 2020
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
      doubleArray0[0] = (-22.3532903045446);
      doubleArray0[1] = (-607.94);
      doubleArray0[2] = (-1633.9234811278473);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-22.3532903045446);
      doubleArray1[1] = (-1633.9234811278473);
      doubleArray1[2] = (-1633.9234811278473);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = (-1633.9234811278473);
      doubleArray1[5] = 0.0;
      doubleArray1[7] = (-22.3532903045446);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}
