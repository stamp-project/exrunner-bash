/*

 * Mon Apr 20 10:02:10 UTC 2020
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
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2284.478;
      doubleArray0[1] = 2217.93193;
      doubleArray0[2] = 1.570796326794897;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2217.93193;
      doubleArray1[1] = 2217.93193;
      doubleArray1[4] = 1.570796326794897;
      doubleArray1[5] = 2217.93193;
      doubleArray1[6] = 2217.93193;
      doubleArray1[7] = 2217.93193;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-8535.424770871015));
  }
}
