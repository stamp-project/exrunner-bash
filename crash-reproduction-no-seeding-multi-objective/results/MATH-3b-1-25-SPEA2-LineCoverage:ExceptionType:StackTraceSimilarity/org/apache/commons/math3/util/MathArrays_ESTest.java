/*

 * Tue Apr 21 08:37:17 UTC 2020
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MathArrays_ESTest extends MathArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[0] = 866.0F;
      floatArray0[1] = (-4203.045F);
      floatArray0[2] = (-1060.0442F);
      floatArray0[3] = 2627.7078F;
      floatArray0[4] = 3.4028235E38F;
      floatArray0[5] = 961.71954F;
      floatArray0[6] = (-1809.2F);
      floatArray0[7] = (-1038.1372F);
      floatArray0[8] = (-1.0F);
      MathArrays.equals(floatArray0, floatArray0);
      MathArrays.linearCombination((double) (-4203.045F), (double) 2627.7078F, (double) (-1038.1372F), (double) 961.71954F, (double) (-1809.2F), 1450.47046, 0.0, (double) 961.71954F);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-1060.0442F);
      // Undeclared exception!
      MathArrays.linearCombination(doubleArray0, doubleArray0);
  }
}
