/*

 * Mon Apr 20 09:58:19 UTC 2020
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
      double double0 = 0.9;
      doubleArray0[0] = 0.9;
      double double1 = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = 1957.3197;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 0.9;
      doubleArray1[1] = 0.9;
      doubleArray1[2] = 1957.3197;
      double double2 = 0.0012601868579019632;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0012601868579019632);
  }
}
