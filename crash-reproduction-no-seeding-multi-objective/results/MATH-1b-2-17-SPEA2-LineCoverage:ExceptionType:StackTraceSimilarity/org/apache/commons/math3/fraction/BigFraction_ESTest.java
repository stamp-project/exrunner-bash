/*

 * Tue Apr 21 07:56:15 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-2512.8199117), (-587));
      bigFraction0.byteValue();
      BigFraction bigFraction1 = bigFraction0.abs();
      bigFraction0.shortValue();
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction2 = bigFraction0.multiply(bigInteger0);
      bigFraction0.add(bigInteger0);
      bigFraction2.add(bigFraction1);
      bigFraction2.longValue();
      BigFraction bigFraction3 = new BigFraction((double) (-587), (int) (byte)47);
  }
}
