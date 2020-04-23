/*

 * Mon Apr 20 10:03:22 UTC 2020
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
      doubleArray0[0] = 177.9646969878;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 1747.1303;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-2653.860795144);
      doubleArray0[6] = 0.0;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1747.1303;
      doubleArray0[6] = 1747.1303;
      doubleArray1[2] = 177.9646969878;
      doubleArray1[3] = (-2653.860795144);
      doubleArray1[4] = 1747.1303;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-46.9));
  }
}
