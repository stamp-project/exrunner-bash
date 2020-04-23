/*

 * Mon Apr 20 09:54:22 UTC 2020
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
      double double0 = (-663.68525);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.9640275800758169;
      doubleArray1[1] = 3590.0;
      doubleArray1[2] = 0.9640275800758169;
      doubleArray1[3] = (-1615.0);
      doubleArray1[4] = 0.0;
      doubleArray1[5] = (-676.679792552);
      doubleArray1[6] = (-663.68525);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6067.438123464584);
  }
}
