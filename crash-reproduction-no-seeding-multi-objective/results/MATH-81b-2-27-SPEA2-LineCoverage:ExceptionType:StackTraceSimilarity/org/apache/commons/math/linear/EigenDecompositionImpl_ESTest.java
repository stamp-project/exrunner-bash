/*

 * Mon Apr 20 10:09:59 UTC 2020
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
      double double0 = 4.0;
      doubleArray0[0] = 4.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = (-3320.1140346225675);
      doubleArray1[2] = 4.0;
      doubleArray0[3] = 4.0;
      doubleArray1[4] = 807.203607315102;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 739263.4595034134);
  }
}
