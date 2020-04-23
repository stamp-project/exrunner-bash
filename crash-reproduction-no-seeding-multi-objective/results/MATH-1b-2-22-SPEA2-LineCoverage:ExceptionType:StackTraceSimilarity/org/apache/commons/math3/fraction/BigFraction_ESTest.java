/*

 * Tue Apr 21 07:56:22 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-23.49761), 12);
      BigFraction bigFraction1 = bigFraction0.multiply(bigFraction0);
      bigFraction0.doubleValue();
      bigFraction1.getDenominatorAsInt();
      bigFraction0.byteValue();
      bigFraction0.divide(71);
      BigFraction bigFraction2 = BigFraction.MINUS_ONE;
      BigFraction bigFraction3 = new BigFraction((double) (byte) (-23), (int) (byte) (-23));
  }
}
