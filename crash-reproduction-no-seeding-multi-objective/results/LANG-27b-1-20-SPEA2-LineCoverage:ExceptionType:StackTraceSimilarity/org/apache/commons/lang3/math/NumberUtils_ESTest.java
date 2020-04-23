/*

 * Tue Apr 21 07:14:24 UTC 2020
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
      NumberUtils.toShort("Rk]");
      NumberUtils.toDouble("", (double) (short)0);
      NumberUtils.toByte("Rk]");
      short[] shortArray0 = new short[0];
      long[] longArray0 = new long[5];
      longArray0[0] = (-4167L);
      longArray0[1] = (-4167L);
      longArray0[2] = (long) (short)0;
      longArray0[3] = (-4167L);
      longArray0[4] = (-4167L);
      NumberUtils.min(longArray0);
      // Undeclared exception!
      NumberUtils.createNumber("1TRmX&#DEr#~epI");
  }
}
