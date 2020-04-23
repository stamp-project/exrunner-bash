/*

 * Mon Apr 20 10:07:11 UTC 2020
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
      double[] doubleArray0 = new double[10];
      double[] doubleArray1 = new double[9];
      double double0 = 1.45688086398257;
      doubleArray1[0] = 1.45688086398257;
      doubleArray1[4] = 1.45688086398257;
      doubleArray1[2] = 1.45688086398257;
      doubleArray1[3] = (-2474.0);
      doubleArray1[5] = (-2233.139);
      doubleArray1[6] = 1.1680878337947103E-13;
      doubleArray1[7] = 0.2819947174237427;
      doubleArray1[8] = 1.5339972235143065E-11;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2561.2313370688116));
  }
}
