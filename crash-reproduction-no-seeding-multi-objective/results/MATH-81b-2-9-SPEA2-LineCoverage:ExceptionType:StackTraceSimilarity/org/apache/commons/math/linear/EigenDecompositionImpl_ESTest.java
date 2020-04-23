/*

 * Mon Apr 20 09:57:33 UTC 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-292.056);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 0.6931471805599453;
      doubleArray1[1] = 0.6931471805599453;
      doubleArray1[2] = (-292.056);
      doubleArray1[3] = 92.090874939128;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray1, doubleArray0, (-7182234.416509959));
      double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
      eigenDecompositionImpl0.getD();
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = (-292.056);
      doubleArray3[1] = (-7182234.416509959);
      doubleArray3[2] = (-7182234.416509959);
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(doubleArray2, doubleArray3, (-292.05598257144874));
  }
}
