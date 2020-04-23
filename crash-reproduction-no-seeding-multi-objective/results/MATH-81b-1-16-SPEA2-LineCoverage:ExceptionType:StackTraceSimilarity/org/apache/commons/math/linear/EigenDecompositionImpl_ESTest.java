/*

 * Mon Apr 20 10:02:23 UTC 2020
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
      doubleArray0[0] = (-3159.359);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 277.6868416480025;
      doubleArray1[1] = (-3159.359);
      doubleArray1[3] = 277.6868416480025;
      doubleArray1[4] = 277.6868416480025;
      doubleArray1[5] = 1957.0;
      doubleArray1[6] = 0.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 531.4);
  }
}
