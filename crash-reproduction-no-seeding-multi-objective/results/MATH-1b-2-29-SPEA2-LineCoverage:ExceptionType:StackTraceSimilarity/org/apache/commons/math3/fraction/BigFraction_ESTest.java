/*

 * Tue Apr 21 07:56:43 UTC 2020
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
      BigInteger bigInteger0 = BigInteger.ONE;
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
      bigFraction0.equals(bigInteger0);
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      int int0 = 2087;
      BigFraction bigFraction2 = new BigFraction(250.1283511, 2087);
      bigFraction1.subtract(bigInteger0);
      BigFraction bigFraction3 = new BigFraction((double) 2087, 2087);
  }
}
