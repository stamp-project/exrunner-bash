/*

 * Mon Apr 20 10:00:19 UTC 2020
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
      doubleArray0[0] = 0.5235987755982989;
      doubleArray0[4] = (-3309.861664329689);
      doubleArray0[2] = 1191.0033756477;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.5235987755982989;
      doubleArray1[1] = (-1589.95769428);
      doubleArray1[2] = 1191.0033756477;
      doubleArray1[3] = (-3309.861664329689);
      doubleArray1[5] = 0.5235987755982989;
      doubleArray1[6] = (-3309.861664329689);
      doubleArray1[7] = 1191.0033756477;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3531.799182339884);
  }
}
