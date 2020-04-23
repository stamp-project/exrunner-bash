/*

 * Mon Apr 20 10:00:11 UTC 2020
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
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 3649.374941202454;
      doubleArray1[2] = (-3698.0);
      doubleArray1[3] = 3649.374941202454;
      doubleArray1[4] = 1.285468935E7;
      doubleArray1[5] = 2.980232238769531E-7;
      doubleArray1[6] = 2.980232238769531E-7;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 2.980232238769531E-7;
      doubleArray2[1] = 0.25;
      doubleArray2[2] = (-3698.0);
      doubleArray2[3] = (-1419.593193788);
      doubleArray2[4] = 3649.374941202454;
      doubleArray2[5] = 1.285468935E7;
      doubleArray2[6] = 1.285468935E7;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray2, 2.493308911625015E-45);
  }
}
