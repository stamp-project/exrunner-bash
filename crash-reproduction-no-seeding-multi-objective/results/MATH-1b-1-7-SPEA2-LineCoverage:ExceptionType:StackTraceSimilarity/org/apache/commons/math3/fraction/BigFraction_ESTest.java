/*

 * Tue Apr 21 07:55:21 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(551.1210408406);
      BigFraction bigFraction1 = bigFraction0.subtract(0L);
      BigFraction bigFraction2 = new BigFraction(551.1210408406, 3);
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction3 = new BigFraction(bigInteger0, bigInteger0);
      bigFraction0.floatValue();
      bigFraction3.getNumeratorAsInt();
      bigFraction1.add(bigFraction3);
      BigFraction bigFraction4 = new BigFraction(4.005882964287806E-150, 551.12103F, Integer.MAX_VALUE);
      bigFraction1.multiply(bigFraction4);
      int int0 = (-1385);
      int int1 = (-692);
      BigFraction bigFraction5 = new BigFraction(1.0, (-692));
  }
}
