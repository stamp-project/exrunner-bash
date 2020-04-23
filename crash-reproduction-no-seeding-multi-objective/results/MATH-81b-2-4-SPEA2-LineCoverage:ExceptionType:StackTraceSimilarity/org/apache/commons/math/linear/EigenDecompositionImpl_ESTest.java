/*

 * Mon Apr 20 09:56:15 UTC 2020
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
      double double0 = 4.0;
      double double1 = 3361.825531148975;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 4.0;
      double double2 = (-1535.0);
      doubleArray1[1] = (-1535.0);
      doubleArray1[2] = 3361.825531148975;
      double double3 = 1406.654861762766;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1406.654861762766);
  }
}
