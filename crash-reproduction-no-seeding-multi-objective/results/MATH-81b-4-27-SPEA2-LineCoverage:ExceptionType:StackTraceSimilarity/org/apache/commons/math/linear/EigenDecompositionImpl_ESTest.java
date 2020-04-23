/*

 * Mon Apr 20 10:06:20 UTC 2020
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
      doubleArray0[0] = 1.5;
      doubleArray0[1] = 2141.5601067859775;
      doubleArray0[2] = 2141.5601067859775;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-4280.544123687673);
      double double0 = 3359.2753;
      double[] doubleArray1 = new double[7];
      double double1 = 1339.075886;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, 32.0);
  }
}
