/*

 * Mon Apr 20 10:09:40 UTC 2020
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
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[3] = 2.2250738585072014E-308;
      doubleArray0[4] = 2.493506493506493;
      doubleArray0[5] = 1.0986122886681096;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0986122886681096;
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 1.0986122886681096;
      doubleArray1[3] = (-2154.481);
      doubleArray1[4] = (-2154.481);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
  }
}
