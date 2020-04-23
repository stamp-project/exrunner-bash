/*

 * Tue Apr 21 07:56:37 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(100L);
      BigFraction bigFraction1 = bigFraction0.multiply(100L);
      BigFraction bigFraction2 = bigFraction1.multiply(bigFraction1);
      bigFraction2.toString();
      BigFraction bigFraction3 = new BigFraction(52, 52);
      bigFraction1.shortValue();
      bigFraction1.divide(100L);
      BigFraction bigFraction4 = new BigFraction(584.83954517387, (-1022));
      BigFraction bigFraction5 = new BigFraction((double) (short)10000);
      bigFraction4.getField();
      BigFraction bigFraction6 = bigFraction2.reduce();
      BigFraction bigFraction7 = bigFraction2.subtract(bigFraction6);
      BigInteger bigInteger0 = bigFraction4.getDenominator();
      bigFraction3.pow(bigInteger0);
      bigFraction5.pow(0.0);
      bigFraction1.getField();
      bigFraction1.getDenominatorAsInt();
      int int0 = (-1);
      bigFraction2.add((-1));
      BigFraction bigFraction8 = bigFraction6.multiply((int) (short)10000);
      BigFraction bigFraction9 = bigFraction7.subtract(333L);
      bigFraction5.toString();
      long long0 = 1282L;
      bigFraction9.multiply(1282L);
      bigFraction8.reciprocal();
      BigFraction bigFraction10 = new BigFraction((double) 333L, (int) (short)10000);
  }
}
