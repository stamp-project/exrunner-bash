/*

 * Mon Apr 20 09:58:15 UTC 2020
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
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 1.0;
      double double0 = 1029.23723636722;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1029.23723636722;
      doubleArray0[6] = 1.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1029.23723636722;
      doubleArray0[5] = 1029.23723636722;
      doubleArray1[6] = Double.POSITIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.0);
  }
}
