/*

 * Tue Apr 21 07:56:02 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-399));
      BigFraction bigFraction1 = bigFraction0.multiply((-399));
      bigFraction0.shortValue();
      bigFraction0.longValue();
      bigFraction1.getNumeratorAsLong();
      BigFraction bigFraction2 = new BigFraction((double) (short) (-399), 4);
  }
}
