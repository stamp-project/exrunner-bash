/*

 * Mon Apr 20 09:57:17 UTC 2020
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-606.4741969678661);
      doubleArray0[3] = 740.2333;
      doubleArray0[2] = 2077.61;
      doubleArray0[3] = (-863.2);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 5.0;
      doubleArray1[1] = (-863.2);
      doubleArray1[2] = 740.2333;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.1102230246251565E-14);
  }
}
