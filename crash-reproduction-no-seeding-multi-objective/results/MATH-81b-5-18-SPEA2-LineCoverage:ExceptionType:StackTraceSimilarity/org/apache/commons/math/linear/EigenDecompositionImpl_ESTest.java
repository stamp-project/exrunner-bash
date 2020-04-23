/*

 * Mon Apr 20 10:02:47 UTC 2020
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
      doubleArray0[0] = (-128.117);
      double[] doubleArray1 = new double[6];
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (-2262.16205);
      doubleArray2[1] = 0.0;
      doubleArray2[2] = 0.333;
      doubleArray2[3] = (-2134.6349827126583);
      doubleArray2[4] = 10.06766199577777;
      doubleArray2[5] = 1214.56084;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, (-2262.16205));
  }
}
