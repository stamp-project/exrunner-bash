/*

 * Mon Apr 20 10:01:30 UTC 2020
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
      doubleArray0[0] = 3624.06323047126;
      doubleArray0[1] = 1689.198049532;
      doubleArray0[2] = 1.1102230246251565E-14;
      doubleArray0[3] = 235.5312141157;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 3624.06323047126;
      doubleArray1[1] = 235.5312141157;
      doubleArray1[2] = 3624.06323047126;
      doubleArray1[3] = 1689.198049532;
      doubleArray1[4] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 235.5312141157);
  }
}
