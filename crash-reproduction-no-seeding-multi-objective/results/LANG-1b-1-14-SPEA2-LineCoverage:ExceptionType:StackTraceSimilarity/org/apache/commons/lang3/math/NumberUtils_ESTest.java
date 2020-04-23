/*

 * Tue Apr 21 07:00:10 UTC 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1010.4);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      NumberUtils.max(doubleArray0);
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte1 = (byte)75;
      byteArray0[2] = (byte)75;
      byte byte2 = (byte)109;
      byteArray0[3] = (byte)109;
      NumberUtils.min(byteArray0);
      String string0 = null;
      NumberUtils.toShort((String) null, (short) (byte)75);
      // Undeclared exception!
      NumberUtils.createInteger("");
  }
}
