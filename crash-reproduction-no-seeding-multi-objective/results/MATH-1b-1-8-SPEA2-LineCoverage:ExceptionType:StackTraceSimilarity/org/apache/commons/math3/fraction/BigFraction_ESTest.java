/*

 * Tue Apr 21 07:55:31 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-266L), (-266L));
      int int0 = (-564);
      BigFraction bigFraction1 = bigFraction0.divide((-564));
      bigFraction0.toString();
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction2 = bigFraction0.pow(bigInteger0);
      BigFraction bigFraction3 = new BigFraction((-564));
      bigFraction3.multiply(750);
      bigFraction2.multiply(bigInteger0);
      bigFraction1.doubleValue();
      BigFraction bigFraction4 = new BigFraction(750);
      BigFraction bigFraction5 = new BigFraction((double) (-564), 750);
  }
}
