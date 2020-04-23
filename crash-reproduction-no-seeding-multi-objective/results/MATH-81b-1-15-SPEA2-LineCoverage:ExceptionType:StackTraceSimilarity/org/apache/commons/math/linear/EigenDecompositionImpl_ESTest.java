/*

 * Mon Apr 20 10:00:53 UTC 2020
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
      doubleArray0[0] = (-1140.4236124910997);
      doubleArray0[1] = (-1690.9923365);
      doubleArray0[2] = 191.03;
      doubleArray0[0] = 20.6199660304462;
      double double0 = 0.0;
      doubleArray0[4] = 0.0;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 191.03;
      doubleArray1[1] = 20.6199660304462;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-2211.9844128));
  }
}
