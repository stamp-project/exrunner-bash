/*

 * Mon Apr 20 09:56:46 UTC 2020
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
      doubleArray0[1] = 1224.40761;
      doubleArray0[2] = 0.6931471805599453;
      doubleArray0[3] = 445.2384;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-1.0);
      doubleArray1[2] = 12.566370614359172;
      doubleArray0[0] = (-1.0);
      doubleArray1[4] = (-1.0);
      doubleArray1[5] = 1224.40761;
      doubleArray1[6] = (-1522.3401723);
      doubleArray1[7] = (-4179.115116681501);
      doubleArray1[8] = (-1.0);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-4179.115116681501));
  }
}
