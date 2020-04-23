/*

 * Mon Apr 20 10:06:38 UTC 2020
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
      doubleArray0[1] = 581.719;
      doubleArray0[6] = 264.22455;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-0.2060843241198936);
      doubleArray0[5] = (-691.15);
      doubleArray0[6] = 1542.72;
      doubleArray0[7] = 0.0;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-0.2060843241198936);
      doubleArray1[1] = (-0.2060843241198936);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 264.22455);
  }
}
