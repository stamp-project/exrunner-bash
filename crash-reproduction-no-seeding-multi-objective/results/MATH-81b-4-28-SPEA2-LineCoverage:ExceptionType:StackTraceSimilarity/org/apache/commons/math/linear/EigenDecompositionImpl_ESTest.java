/*

 * Mon Apr 20 10:06:58 UTC 2020
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.7556714757386604;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.7556714757386604;
      doubleArray1[1] = 0.7556714757386604;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 0.7556714757386604;
      double double0 = (-1221.817);
      doubleArray1[4] = (-1221.817);
      doubleArray1[5] = 0.7556714757386604;
      doubleArray1[6] = 0.0;
      doubleArray1[7] = 0.7556714757386604;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 0.7556714757386604;
      doubleArray2[1] = (-1221.817);
      doubleArray2[2] = 3075.94;
      doubleArray2[4] = 0.0;
      doubleArray2[5] = 0.7556714757386604;
      doubleArray2[6] = 0.7556714757386604;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 0.7556714757386604);
  }
}
