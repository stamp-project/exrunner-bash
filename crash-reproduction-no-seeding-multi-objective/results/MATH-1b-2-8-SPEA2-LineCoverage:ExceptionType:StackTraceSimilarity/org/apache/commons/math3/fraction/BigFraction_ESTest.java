/*

 * Tue Apr 21 07:55:38 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(2359);
      bigFraction0.intValue();
      bigFraction0.getDenominator();
      bigFraction0.floatValue();
      BigFraction bigFraction1 = bigFraction0.pow((long) 2359);
      BigFraction bigFraction2 = bigFraction1.multiply((-1));
      BigFraction bigFraction3 = bigFraction2.divide(2147483647L);
      bigFraction3.toString();
      bigFraction1.bigDecimalValue();
      bigFraction0.longValue();
      bigFraction1.multiply(2359);
      bigFraction2.abs();
      BigFraction bigFraction4 = new BigFraction((-954.589578), Integer.MAX_VALUE);
      bigFraction0.multiply(1);
      BigFraction bigFraction5 = new BigFraction(2359.0F, (-2703));
  }
}
