/*

 * Mon Apr 20 10:02:03 UTC 2020
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
      doubleArray0[0] = (-627.7015);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-98.9482);
      doubleArray0[3] = (-98.9482);
      double double0 = (-2955.37871095);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 651.114;
      doubleArray1[1] = (-899.48);
      doubleArray1[2] = (-49.63884490555);
      doubleArray0[0] = (-627.7015);
      doubleArray1[4] = (-49.63884490555);
      doubleArray1[5] = 166.304186908704;
      doubleArray1[6] = (-899.48);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1799.2406612769234));
  }
}
