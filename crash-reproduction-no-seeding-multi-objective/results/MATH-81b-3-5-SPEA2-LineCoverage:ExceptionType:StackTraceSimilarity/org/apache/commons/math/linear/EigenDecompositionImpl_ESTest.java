/*

 * Mon Apr 20 09:58:02 UTC 2020
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
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 1446.24702;
      doubleArray0[2] = (-674.7994);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-674.7994);
      doubleArray1[1] = 283.18492;
      doubleArray1[2] = 283.18492;
      doubleArray1[3] = 1446.24702;
      doubleArray1[5] = 283.18492;
      doubleArray1[6] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1739.659646751197));
  }
}
