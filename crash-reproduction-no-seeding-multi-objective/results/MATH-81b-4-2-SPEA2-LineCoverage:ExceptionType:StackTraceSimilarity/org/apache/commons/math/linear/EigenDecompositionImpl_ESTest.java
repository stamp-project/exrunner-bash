/*

 * Mon Apr 20 09:54:17 UTC 2020
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
      doubleArray0[0] = 12.566370614359172;
      doubleArray0[1] = 0.0;
      doubleArray0[4] = (-1736.5307448545009);
      doubleArray0[5] = 0.333;
      doubleArray0[6] = 1.0;
      doubleArray0[7] = 0.333;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = (-1736.5307448545009);
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 12.566370614359172;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = (-1736.5307448545009);
      doubleArray1[6] = 1.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1736.5307448545009));
  }
}
