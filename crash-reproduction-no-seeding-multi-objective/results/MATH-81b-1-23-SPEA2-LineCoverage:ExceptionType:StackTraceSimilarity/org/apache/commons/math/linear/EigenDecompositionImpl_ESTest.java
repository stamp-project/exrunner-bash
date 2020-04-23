/*

 * Mon Apr 20 10:03:50 UTC 2020
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
      doubleArray0[0] = 1694.8514515794955;
      doubleArray0[1] = (-6784.7281836401);
      doubleArray0[2] = 8.64588868862;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.9640275800758169;
      doubleArray0[5] = 2025.78061916915;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.9640275800758169;
      doubleArray1[1] = 2025.78061916915;
      doubleArray1[2] = 1694.8514515794955;
      doubleArray1[3] = 8.64588868862;
      doubleArray1[4] = 0.9640275800758169;
      doubleArray1[5] = 0.5;
      doubleArray1[6] = (-6784.7281836401);
      doubleArray1[7] = 1694.8514515794955;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1694.8514515794955);
  }
}
