/*

 * Mon Apr 20 10:03:13 UTC 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 3.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (-1074.56744);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1074.56744);
      double double0 = 1746.6894814166;
      doubleArray1[1] = 1746.6894814166;
      doubleArray1[2] = (-1074.56744);
      doubleArray1[3] = 3.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-4245.084589542626));
  }
}
