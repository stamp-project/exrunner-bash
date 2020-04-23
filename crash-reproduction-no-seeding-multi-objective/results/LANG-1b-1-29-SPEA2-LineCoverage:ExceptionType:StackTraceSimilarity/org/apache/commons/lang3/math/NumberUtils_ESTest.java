/*

 * Tue Apr 21 07:00:56 UTC 2020
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
      long long0 = 0L;
      NumberUtils.max((-166L), 1359L, 0L);
      int int0 = 0;
      NumberUtils.max(2268, 2268, 0);
      String string0 = "s+)~ hp\"Q";
      // Undeclared exception!
      NumberUtils.createInteger("s+)~ hp\"Q");
  }
}
