/*

 * Tue Apr 21 07:14:52 UTC 2020
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
      NumberUtils.toByte("}j<gK", (byte)2);
      double[] doubleArray0 = new double[2];
      NumberUtils.isNumber("Minimum abbreviation width with offset is 7");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte)77;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte) (-113);
      byteArray0[5] = (byte)77;
      byteArray0[6] = (byte)5;
      NumberUtils.max(byteArray0);
      NumberUtils.isDigits("-;5Hm~pGg{-");
      // Undeclared exception!
      NumberUtils.createNumber("4J[e_R8VyWu5puE");
  }
}
