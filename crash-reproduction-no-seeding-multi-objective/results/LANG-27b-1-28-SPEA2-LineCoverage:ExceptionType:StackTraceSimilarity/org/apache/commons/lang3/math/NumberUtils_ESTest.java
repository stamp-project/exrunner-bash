/*

 * Tue Apr 21 07:15:20 UTC 2020
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
      Byte byte0 = new Byte((byte)0);
      Byte byte1 = new Byte((byte)0);
      Byte.toUnsignedInt((byte)118);
      NumberUtils.createNumber("-0");
      NumberUtils.max((int) (byte) (-68), (int) (byte) (-68), (int) (byte)118);
      Byte byte2 = NumberUtils.BYTE_MINUS_ONE;
      Byte.compare((byte)5, (byte) (-116));
      // Undeclared exception!
      NumberUtils.createNumber("$y%tVE>I!|=/<ie{<");
  }
}
