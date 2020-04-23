/*

 * Tue Apr 21 07:00:39 UTC 2020
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
      float float0 = 0.0F;
      float float1 = 1878.52F;
      NumberUtils.min(0.0F, 0.0F, 1878.52F);
      String string0 = "";
      long long0 = 0L;
      NumberUtils.toLong("", 0L);
      // Undeclared exception!
      NumberUtils.createInteger("");
  }
}
