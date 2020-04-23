/*

 * Tue Apr 21 07:13:45 UTC 2020
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
      NumberUtils.max(0.0F, 0.0F, 494.25F);
      NumberUtils.isNumber("The Array must not be null");
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short)0;
      shortArray0[1] = (short)0;
      // Undeclared exception!
      NumberUtils.createNumber("7XetP7AmNiscBvE?");
  }
}
