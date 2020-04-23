/*

 * Tue Apr 21 07:55:15 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(1164L);
      BigFraction bigFraction1 = new BigFraction(1164L, 1164L, 1);
      bigFraction0.hashCode();
      BigFraction bigFraction2 = new BigFraction((-646.7961940439951));
      bigFraction1.intValue();
      bigFraction2.byteValue();
      bigFraction0.getField();
      BigFraction bigFraction3 = new BigFraction((-646.7961940439951), 4);
      bigFraction1.add((long) 4);
      bigFraction3.bigDecimalValue();
      BigFraction.getReducedFraction(781, (-1));
      BigInteger bigInteger0 = BigInteger.TEN;
      BigInteger bigInteger1 = BigInteger.TEN;
      bigInteger0.multiply(bigInteger1);
      bigFraction3.subtract(bigInteger0);
      BigFraction bigFraction4 = new BigFraction((double) 1164L, 558);
  }
}
