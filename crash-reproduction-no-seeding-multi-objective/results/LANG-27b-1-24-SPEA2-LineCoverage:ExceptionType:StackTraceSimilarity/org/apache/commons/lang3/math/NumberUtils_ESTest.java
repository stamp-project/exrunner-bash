/*

 * Tue Apr 21 07:14:49 UTC 2020
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
      NumberUtils.toByte("The Array must not be null");
      int[] intArray0 = new int[6];
      byte byte0 = (byte)0;
      byte byte1 = (byte)85;
      Float float0 = new Float(1118.964F);
      // Undeclared exception!
      NumberUtils.createNumber("51AeCS$E");
  }
}
