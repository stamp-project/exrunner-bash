/*

 * Mon Apr 20 09:56:57 UTC 2020
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
      doubleArray0[0] = 54.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1864.05;
      double double0 = 1686.8141;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 0.3333333333333333;
      doubleArray2[1] = 549.89082;
      doubleArray2[2] = 0.3333333333333333;
      doubleArray2[3] = 0.0;
      doubleArray2[4] = 1830.0;
      doubleArray2[1] = 549.89082;
      doubleArray2[6] = (-244.7861539311477);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, (-244.7861539311477));
  }
}
