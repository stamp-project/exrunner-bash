/*

 * Mon Apr 20 09:54:57 UTC 2020
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
      doubleArray0[0] = (-2837.468848);
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-4061.6130197759);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1009.0);
      doubleArray0[5] = (-44.5121478);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2837.468848);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = (-1009.0);
      doubleArray1[3] = (-4061.6130197759);
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = (-1.0);
      doubleArray2[1] = (-4061.6130197759);
      doubleArray2[2] = (-2837.468848);
      doubleArray2[3] = (-2837.468848);
      doubleArray2[4] = (-4061.6130197759);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray2, (-2837.468848));
  }
}
