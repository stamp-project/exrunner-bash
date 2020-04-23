/*

 * Tue Apr 21 07:54:51 UTC 2020
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
      BigFraction bigFraction0 = BigFraction.ONE_THIRD;
      bigFraction0.toString();
      double double0 = (-305.1144725938);
      BigFraction bigFraction1 = new BigFraction((-305.1144725938));
      double double1 = (-3511.449171);
      int int0 = 857;
      BigFraction bigFraction2 = new BigFraction((-3511.449171), 857);
      BigFraction bigFraction3 = new BigFraction((double) 857, 857);
  }
}
