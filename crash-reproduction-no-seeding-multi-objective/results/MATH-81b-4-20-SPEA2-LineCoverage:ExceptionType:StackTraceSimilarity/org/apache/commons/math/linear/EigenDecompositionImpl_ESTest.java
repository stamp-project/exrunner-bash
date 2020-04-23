/*

 * Mon Apr 20 10:05:33 UTC 2020
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
      double[] doubleArray0 = new double[18];
      doubleArray0[0] = (-3624.0263102319595);
      doubleArray0[1] = 1.414213562373095;
      double double0 = (-2940.0);
      doubleArray0[2] = (-2940.0);
      double[] doubleArray1 = new double[4];
      double double1 = 0.9640275800758169;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 1.414213562373095;
      doubleArray2[1] = (-2940.0);
      doubleArray2[2] = (-3624.0263102319595);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, (-2940.0));
  }
}
