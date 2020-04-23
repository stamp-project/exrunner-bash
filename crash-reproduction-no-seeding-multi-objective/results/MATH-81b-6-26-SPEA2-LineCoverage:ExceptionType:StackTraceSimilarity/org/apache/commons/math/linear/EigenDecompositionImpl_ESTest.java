/*

 * Mon Apr 20 10:05:57 UTC 2020
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
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 8.524551;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-3026.692010446368);
      doubleArray1[1] = (-2859.0887969);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 3.7416573867739413;
      doubleArray1[5] = (-3026.692010446368);
      doubleArray1[6] = 8.524551;
      doubleArray1[7] = (-2859.0887969);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 5330.19601327899);
  }
}
