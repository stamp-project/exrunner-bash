/*

 * Tue Apr 21 06:59:13 UTC 2020
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
      long[] longArray0 = new long[8];
      longArray0[0] = 0L;
      longArray0[1] = (-952L);
      longArray0[2] = (-453L);
      longArray0[3] = 1631L;
      longArray0[4] = 0L;
      longArray0[5] = (-870L);
      longArray0[6] = (-2854L);
      longArray0[7] = 2408L;
      NumberUtils.max(longArray0);
      String string0 = "";
      // Undeclared exception!
      NumberUtils.createInteger("");
  }
}
