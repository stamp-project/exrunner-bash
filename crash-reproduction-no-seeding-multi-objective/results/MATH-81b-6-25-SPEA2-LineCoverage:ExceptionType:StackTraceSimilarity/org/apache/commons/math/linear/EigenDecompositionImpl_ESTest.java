/*

 * Mon Apr 20 10:05:05 UTC 2020
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.585591128274;
      doubleArray0[1] = 1246.1759;
      doubleArray0[2] = (-1153.0);
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 2.0;
      doubleArray1[2] = (-244.0);
      doubleArray1[3] = (-244.0);
      doubleArray1[4] = 27.0;
      doubleArray1[5] = 27.0;
      doubleArray1[6] = 27.0;
      doubleArray1[7] = 1246.1759;
      doubleArray1[8] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 0.0);
  }
}
