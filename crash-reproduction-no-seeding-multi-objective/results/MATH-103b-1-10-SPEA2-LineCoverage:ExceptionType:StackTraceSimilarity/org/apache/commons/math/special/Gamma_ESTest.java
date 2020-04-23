/*

 * Tue Apr 21 07:49:22 UTC 2020
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Gamma_ESTest extends Gamma_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gamma.logGamma(1.0);
      Gamma.logGamma(1.0E-8);
      int int0 = (-1096);
      try { 
        Gamma.regularizedGammaP(2119.0, 897.42763, (-1998.800825), (-1096));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-1,096) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
