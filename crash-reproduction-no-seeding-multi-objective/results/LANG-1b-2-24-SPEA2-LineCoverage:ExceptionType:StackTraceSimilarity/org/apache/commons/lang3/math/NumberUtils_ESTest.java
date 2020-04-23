/*

 * Tue Apr 21 07:00:43 UTC 2020
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
      NumberUtils.toFloat("6;G5V6oPfk0(", 0.0F);
      NumberUtils.max(0.0F, 0.0F, 0.0F);
      int[] intArray0 = new int[8];
      intArray0[0] = 525;
      int int0 = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 46;
      intArray0[4] = (-3337);
      String string0 = "-#";
      try { 
        NumberUtils.createNumber("-#");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}
