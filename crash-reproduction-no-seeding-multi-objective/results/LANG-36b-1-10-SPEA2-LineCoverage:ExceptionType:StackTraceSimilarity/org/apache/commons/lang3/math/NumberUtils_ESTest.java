/*

 * Tue Apr 21 07:18:44 UTC 2020
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
      NumberUtils.toDouble("oRzUaOh9jsx_k`OS", 495.5713931);
      NumberUtils.toShort("oRzUaOh9jsx_k`OS");
      NumberUtils.toInt("oRzUaOh9jsx_k`OS");
      String string0 = "";
      NumberUtils.toInt("");
      NumberUtils.max((-2541.019F), (float) 0, (float) 0);
      long long0 = 953L;
      NumberUtils.toLong("oRzUaOh9jsx_k`OS", 953L);
      byte byte0 = (byte)0;
      byte byte1 = (byte)0;
      NumberUtils.min((byte)88, (byte)0, (byte)0);
      try { 
        NumberUtils.createNumber("oRzUaOh9jsx_k`OS");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // oRzUaOh9jsx_k`OS is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }
}
