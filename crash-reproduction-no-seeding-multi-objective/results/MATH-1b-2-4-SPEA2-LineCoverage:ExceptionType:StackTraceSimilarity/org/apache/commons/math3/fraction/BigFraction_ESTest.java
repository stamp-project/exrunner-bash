/*

 * Tue Apr 21 07:55:06 UTC 2020
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
      BigFraction bigFraction0 = BigFraction.THREE_QUARTERS;
      bigFraction0.subtract(2147483647L);
      int int0 = (-3671);
      BigFraction bigFraction1 = new BigFraction(3682.88685956385, (-3671));
      int int1 = (-4228);
      bigFraction0.multiply((-4228));
      BigFraction bigFraction2 = BigFraction.TWO;
      BigFraction bigFraction3 = new BigFraction((double) 2147483647L, (-3671));
  }
}
