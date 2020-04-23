/*

 * Tue Apr 21 07:55:51 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(280);
      bigFraction0.percentageValue();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)51;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)0;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      bigFraction0.add(bigInteger0);
      BigFraction bigFraction1 = new BigFraction(0.3021035440863816, (byte)0);
      BigFraction bigFraction2 = BigFraction.ONE_THIRD;
      BigFraction bigFraction3 = new BigFraction((double) (byte)0, (int) (byte)1);
  }
}
