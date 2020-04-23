/*

 * Mon Apr 20 10:07:19 UTC 2020
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
      doubleArray0[0] = 318.0596331626394;
      double double0 = (-1622.9701);
      doubleArray0[1] = (-1622.9701);
      doubleArray0[2] = 318.0596331626394;
      doubleArray0[3] = 1867.9;
      doubleArray0[4] = 1867.9;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 543.64627125;
      doubleArray1[1] = (-29.93337227570917);
      doubleArray1[2] = (-1622.9701);
      doubleArray1[3] = 1867.9;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1622.9701));
  }
}
