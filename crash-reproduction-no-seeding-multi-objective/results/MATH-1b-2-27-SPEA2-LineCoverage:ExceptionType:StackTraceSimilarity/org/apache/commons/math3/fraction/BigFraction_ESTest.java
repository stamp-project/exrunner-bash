/*

 * Tue Apr 21 07:56:45 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-5863.792473), 29);
      BigFraction bigFraction1 = BigFraction.TWO_THIRDS;
      BigFraction bigFraction2 = new BigFraction(29, 29, 29);
      BigFraction bigFraction3 = new BigFraction((double) 29, 29);
  }
}
