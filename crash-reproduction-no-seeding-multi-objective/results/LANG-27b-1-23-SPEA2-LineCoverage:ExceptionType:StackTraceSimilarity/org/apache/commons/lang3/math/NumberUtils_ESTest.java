/*

 * Tue Apr 21 07:14:36 UTC 2020
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
      NumberUtils numberUtils0 = new NumberUtils();
      short[] shortArray0 = new short[4];
      shortArray0[0] = (short)43;
      shortArray0[1] = (short)70;
      shortArray0[2] = (short) (-19635);
      shortArray0[3] = (short) (-850);
      NumberUtils.min(shortArray0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (short)70;
      doubleArray0[1] = (double) (short)43;
      doubleArray0[2] = (double) (short)43;
      doubleArray0[3] = (double) (short)70;
      NumberUtils.max(doubleArray0);
      String string0 = "]R:QXAPj%";
      NumberUtils.isNumber("]R:QXAPj%");
      NumberUtils.toFloat("The Array must not be null", (-3793.11F));
      NumberUtils.max(doubleArray0);
      NumberUtils.isNumber("z1j8kVubS#=P@");
      NumberUtils.toFloat("o~3ESN$Mw)L|e~O", 2728.0F);
      NumberUtils.min((byte) (-20), (byte) (-61), (byte)85);
      NumberUtils.min(doubleArray0);
      // Undeclared exception!
      NumberUtils.createNumber("o~3ESN$Mw)L|e~O");
  }
}
