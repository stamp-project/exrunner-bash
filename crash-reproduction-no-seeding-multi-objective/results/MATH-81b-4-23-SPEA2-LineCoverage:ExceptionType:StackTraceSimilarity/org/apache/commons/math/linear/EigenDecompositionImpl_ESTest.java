/*

 * Mon Apr 20 10:04:24 UTC 2020
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
      doubleArray0[0] = 705.033;
      doubleArray0[1] = 0.25;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.25;
      doubleArray0[4] = 0.25;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.5;
      doubleArray1[1] = 2.220446049250313E-16;
      doubleArray1[2] = 705.033;
      doubleArray1[3] = 0.5;
      doubleArray1[4] = 0.3010299956639812;
      doubleArray1[5] = 705.033;
      doubleArray1[6] = 488.0;
      doubleArray1[7] = 2.220446049250313E-16;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 901.052497);
  }
}
