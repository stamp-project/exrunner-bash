/*

 * Tue Apr 21 07:56:18 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-3530L));
      BigFraction bigFraction1 = new BigFraction(2772, 39);
      BigFraction bigFraction2 = bigFraction1.reduce();
      BigFraction bigFraction3 = new BigFraction((-1687.3189058), 2772);
      bigFraction3.divide(bigFraction0);
      BigInteger bigInteger0 = BigInteger.ONE;
      bigFraction2.subtract(bigInteger0);
      BigFraction bigFraction4 = new BigFraction((double) 39, 3985);
  }
}
