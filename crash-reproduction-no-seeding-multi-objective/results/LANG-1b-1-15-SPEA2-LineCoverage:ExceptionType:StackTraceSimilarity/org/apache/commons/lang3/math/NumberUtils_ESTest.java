/*

 * Tue Apr 21 07:00:12 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberUtils.toDouble("");
      NumberUtils.isNumber("(%U*'Dy\"GK");
      float[] floatArray0 = new float[8];
      floatArray0[0] = 0.0F;
      floatArray0[1] = 0.0F;
      floatArray0[2] = 2399.5662F;
      floatArray0[3] = 1122.998F;
      floatArray0[4] = (-1077.0F);
      floatArray0[5] = 0.0F;
      floatArray0[6] = 5360.418F;
      floatArray0[7] = 0.0F;
      NumberUtils.max(floatArray0);
      // Undeclared exception!
      NumberUtils.createInteger("(%U*'Dy\"GK");
  }
}
