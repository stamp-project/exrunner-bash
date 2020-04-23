/*

 * Mon Apr 20 09:58:50 UTC 2020
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
      doubleArray0[0] = 387.297671;
      doubleArray0[1] = 387.297671;
      doubleArray0[2] = 1.6815872944440861E-25;
      doubleArray0[3] = 387.297671;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.008418176493110255;
      doubleArray1[1] = 387.297671;
      doubleArray1[2] = 387.297671;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.6815872944440861E-25);
  }
}
