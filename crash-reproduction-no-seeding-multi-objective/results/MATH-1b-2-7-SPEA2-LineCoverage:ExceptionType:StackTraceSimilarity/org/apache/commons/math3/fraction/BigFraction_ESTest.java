/*

 * Tue Apr 21 07:55:34 UTC 2020
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
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigFraction bigFraction0 = new BigFraction(bigInteger0);
      BigInteger bigInteger1 = bigFraction0.getDenominator();
      BigFraction bigFraction1 = bigFraction0.divide(121);
      BigFraction bigFraction2 = new BigFraction(0L);
      bigFraction1.pow(bigInteger1);
      BigInteger bigInteger2 = bigFraction2.getNumerator();
      BigFraction bigFraction3 = new BigFraction((-2705.99322), 121);
      BigFraction bigFraction4 = BigFraction.getReducedFraction(121, (-2668));
      bigFraction4.multiply(bigInteger2);
      BigFraction bigFraction5 = new BigFraction(0.0, 4186);
  }
}
