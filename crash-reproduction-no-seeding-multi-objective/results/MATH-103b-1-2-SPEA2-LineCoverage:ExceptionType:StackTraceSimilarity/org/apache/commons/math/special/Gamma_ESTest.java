/*

 * Tue Apr 21 07:48:36 UTC 2020
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
      Gamma.logGamma(8.441822398385275E-5);
      double double0 = 0.0;
      int int0 = (-1);
      try { 
        Gamma.regularizedGammaP(9.379678534031024, 9.379678534031024, 0.0, (-1));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
