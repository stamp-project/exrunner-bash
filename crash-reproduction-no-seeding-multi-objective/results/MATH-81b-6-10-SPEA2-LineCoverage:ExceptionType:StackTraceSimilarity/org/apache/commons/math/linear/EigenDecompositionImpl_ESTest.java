/*

 * Mon Apr 20 09:57:40 UTC 2020
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
      doubleArray0[0] = 1253.892;
      doubleArray0[1] = 5.4868;
      doubleArray0[2] = (-3267.035769872);
      doubleArray0[3] = (-1603.4793587);
      doubleArray0[4] = (-1523.3030802726);
      doubleArray0[5] = 1374.673888376089;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1374.673888376089;
      doubleArray1[1] = 5.4868;
      doubleArray1[2] = 1253.892;
      doubleArray1[4] = (-1523.3030802726);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1857.5003499903053));
  }
}
