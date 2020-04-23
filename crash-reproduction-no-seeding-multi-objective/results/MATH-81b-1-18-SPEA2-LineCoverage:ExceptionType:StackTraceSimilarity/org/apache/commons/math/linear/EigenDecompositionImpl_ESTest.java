/*

 * Mon Apr 20 10:01:31 UTC 2020
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
      doubleArray0[0] = 22.2094089225;
      doubleArray0[1] = 14.5871157264;
      doubleArray0[2] = 0.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 14.5871157264;
      doubleArray1[2] = 1247.058349913035;
      doubleArray1[3] = 22.2094089225;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
  }
}
