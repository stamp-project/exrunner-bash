/*

 * Tue Apr 21 07:55:37 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-1185L), (-1185L));
      BigFraction bigFraction1 = bigFraction0.abs();
      bigFraction1.negate();
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction2 = new BigFraction(bigInteger0, bigInteger0);
      bigFraction1.multiply(bigInteger0);
      bigFraction2.getDenominator();
      int int0 = 754;
      BigFraction bigFraction3 = new BigFraction(1144.6942, 754);
      BigFraction bigFraction4 = new BigFraction((long) 754);
      BigFraction bigFraction5 = new BigFraction((double) (-1185L), 754);
  }
}
