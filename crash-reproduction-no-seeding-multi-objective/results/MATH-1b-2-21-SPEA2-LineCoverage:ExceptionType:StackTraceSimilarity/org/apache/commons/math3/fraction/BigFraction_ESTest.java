/*

 * Tue Apr 21 07:56:20 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(1504);
      bigFraction0.percentageValue();
      BigFraction bigFraction1 = bigFraction0.subtract((long) 1504);
      bigFraction0.percentageValue();
      BigFraction bigFraction2 = BigFraction.ZERO;
      BigInteger bigInteger0 = BigInteger.valueOf(1504);
      bigFraction1.subtract(bigInteger0);
      BigFraction bigFraction3 = new BigFraction(2.5887417793273926, 1504);
      bigFraction3.longValue();
      BigFraction bigFraction4 = new BigFraction((double) (-1), 1504);
  }
}
