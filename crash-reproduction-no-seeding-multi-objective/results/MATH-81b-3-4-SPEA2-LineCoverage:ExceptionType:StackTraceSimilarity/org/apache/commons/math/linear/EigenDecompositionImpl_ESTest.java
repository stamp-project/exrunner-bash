/*

 * Mon Apr 20 09:57:01 UTC 2020
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
      double double0 = (-914.4936555526315);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 0.25;
      doubleArray1[1] = 1087.75;
      doubleArray1[2] = 2156.5008404379714;
      doubleArray1[4] = 10.06766199577777;
      doubleArray1[7] = 2.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.5);
  }
}
