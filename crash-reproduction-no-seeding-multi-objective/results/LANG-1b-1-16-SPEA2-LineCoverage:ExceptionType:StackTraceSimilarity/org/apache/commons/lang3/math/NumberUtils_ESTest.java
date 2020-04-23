/*

 * Tue Apr 21 07:00:14 UTC 2020
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
      String string0 = "`T2{.";
      NumberUtils.toShort("`T2{.", (short)415);
      NumberUtils.min((double) (short)415, (-1371.87), (-203.2673));
      String string1 = "w5L=[";
      NumberUtils.toFloat("w5L=[");
      // Undeclared exception!
      NumberUtils.createInteger("w5L=[");
  }
}
