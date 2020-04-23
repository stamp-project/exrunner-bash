/*

 * Mon Apr 20 10:00:46 UTC 2020
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
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 6.0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 2286.463279;
      doubleArray1[2] = 2286.463279;
      doubleArray1[3] = 2286.463279;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, Double.POSITIVE_INFINITY);
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 6.0;
      doubleArray2[1] = 2286.463279;
      doubleArray2[2] = 2286.463279;
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(doubleArray1, doubleArray2, (-1829.0268325463));
  }
}
