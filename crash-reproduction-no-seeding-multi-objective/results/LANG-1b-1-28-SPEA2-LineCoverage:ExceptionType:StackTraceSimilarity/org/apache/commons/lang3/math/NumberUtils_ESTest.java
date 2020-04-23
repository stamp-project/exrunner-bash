/*

 * Tue Apr 21 07:00:53 UTC 2020
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
      float float0 = 0.0F;
      NumberUtils.max(1088.1736F, 0.0F, 258.081F);
      long[] longArray0 = new long[4];
      longArray0[0] = 1L;
      longArray0[1] = 0L;
      long long0 = 0L;
      longArray0[2] = 0L;
      longArray0[3] = (-1L);
      NumberUtils.min(longArray0);
      NumberUtils.toFloat("gbf9U9yh_D");
      // Undeclared exception!
      NumberUtils.createInteger("gbf9U9yh_D");
  }
}
