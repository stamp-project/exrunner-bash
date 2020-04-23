/*

 * Tue Apr 21 07:00:09 UTC 2020
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
      NumberUtils numberUtils0 = new NumberUtils();
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (-3830);
      shortArray0[1] = (short)570;
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) (short) (-3830);
      floatArray0[1] = (float) (short) (-3830);
      floatArray0[2] = (float) (short) (-3830);
      floatArray0[3] = (float) (short) (-3830);
      floatArray0[4] = (float) (short)570;
      NumberUtils.max(floatArray0);
      shortArray0[2] = (short) (-4092);
      shortArray0[3] = (short)755;
      shortArray0[4] = (short) (-29456);
      NumberUtils.min(shortArray0);
      int[] intArray0 = new int[1];
      intArray0[0] = 1424;
      NumberUtils.max(intArray0);
      try { 
        NumberUtils.createNumber("#");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
