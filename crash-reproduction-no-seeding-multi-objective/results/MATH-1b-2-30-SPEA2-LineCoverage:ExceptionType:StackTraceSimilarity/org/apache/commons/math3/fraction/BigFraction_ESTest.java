/*

 * Tue Apr 21 07:57:16 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(1.994572401046753, 714);
      BigFraction bigFraction1 = BigFraction.THREE_FIFTHS;
      long long0 = 76L;
      bigFraction1.pow(76L);
      int int0 = (-1);
      BigFraction bigFraction2 = new BigFraction(3.6614437703974545E-7, 1165);
      bigFraction1.floatValue();
      bigFraction1.percentageValue();
      BigFraction bigFraction3 = new BigFraction((double) 1165, 0);
  }
}
