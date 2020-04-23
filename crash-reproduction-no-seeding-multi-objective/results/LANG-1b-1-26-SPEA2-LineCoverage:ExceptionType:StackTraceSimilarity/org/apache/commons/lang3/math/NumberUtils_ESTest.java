/*

 * Tue Apr 21 07:00:48 UTC 2020
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
      NumberUtils.toByte("{{-=!!", (byte)68);
      NumberUtils.max((-3108.59F), (-3108.59F), (float) (byte)68);
      NumberUtils.toFloat((String) null, 2807.59F);
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (byte)68;
      longArray0[1] = (long) (byte)68;
      longArray0[2] = (long) (byte)68;
      longArray0[3] = (long) (byte)68;
      longArray0[4] = (long) (byte)68;
      longArray0[5] = (long) (byte)68;
      longArray0[6] = (long) (byte)68;
      NumberUtils.min(longArray0);
      NumberUtils.max((-2060L), 68L, 0L);
      NumberUtils.toLong((String) null);
      float[] floatArray0 = new float[3];
      floatArray0[0] = (float) 68L;
      floatArray0[1] = (float) 68L;
      floatArray0[2] = (float) (byte)68;
      NumberUtils.max(floatArray0);
      NumberUtils.min((-724), (-724), (int) (byte)68);
      NumberUtils.min(floatArray0);
      NumberUtils.toShort("x-^5T)");
      // Undeclared exception!
      NumberUtils.createInteger("=hXp-V|d%q");
  }
}
