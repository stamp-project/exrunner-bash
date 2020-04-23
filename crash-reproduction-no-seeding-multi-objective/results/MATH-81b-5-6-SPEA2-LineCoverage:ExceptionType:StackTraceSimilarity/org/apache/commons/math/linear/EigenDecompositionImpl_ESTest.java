/*

 * Mon Apr 20 09:56:31 UTC 2020
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
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1561.5854992464);
      doubleArray1[2] = 1.01;
      doubleArray1[3] = (-2746.24);
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-0.658041423071793);
      doubleArray2[1] = (-1561.5854992464);
      doubleArray2[2] = 125.56349946429336;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, (-2808.7));
  }
}
