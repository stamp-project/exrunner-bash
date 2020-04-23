/*

 * Tue Apr 21 07:55:37 UTC 2020
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
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction0 = new BigFraction(bigInteger0, bigInteger0);
      int int0 = 4;
      BigFraction bigFraction1 = new BigFraction((-1246.6969193815), 4);
      bigFraction1.divide((-1209));
      BigFraction bigFraction2 = new BigFraction((double) 4, 4);
  }
}
