/*

 * Mon Apr 20 10:02:17 UTC 2020
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
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 557.0;
      doubleArray1[1] = (-897.0226722117295);
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 1.5;
      doubleArray2[1] = (-2501.0640965);
      doubleArray2[2] = (-897.0226722117295);
      doubleArray2[4] = (-2634.0);
      doubleArray2[5] = (-2501.0640965);
      doubleArray2[6] = Double.NEGATIVE_INFINITY;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, 0.0);
  }
}
