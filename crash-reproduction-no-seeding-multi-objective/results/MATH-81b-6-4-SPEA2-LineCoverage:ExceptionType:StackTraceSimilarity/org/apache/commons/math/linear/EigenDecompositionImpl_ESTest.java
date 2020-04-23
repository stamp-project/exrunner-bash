/*

 * Mon Apr 20 09:56:59 UTC 2020
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
      doubleArray0[0] = 3071.099960444;
      doubleArray0[1] = 1759.224398825524;
      doubleArray0[0] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 2.0;
      doubleArray0[5] = 689.9837;
      int int0 = (-1822);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2.0;
      doubleArray1[1] = 689.9837;
      doubleArray1[2] = 689.9837;
      doubleArray1[3] = 1759.224398825524;
      doubleArray1[4] = 20.08553692318767;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3552.638925364412));
  }
}
