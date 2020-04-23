/*

 * Tue Apr 21 07:56:16 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction(1476.6, (-2536));
      BigFraction bigFraction1 = new BigFraction((long) (-2536));
      BigFraction bigFraction2 = new BigFraction((-2536), (-2536));
      int int0 = 3637;
      BigFraction bigFraction3 = new BigFraction((-3.00901028043488E-38), 3637);
  }
}
