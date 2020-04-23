/*

 * Tue Apr 21 07:49:44 UTC 2020
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
      Gamma.regularizedGammaQ(1.0E-8, 1.0E-8);
      double double0 = 0.0;
      Gamma.regularizedGammaP(0.0, 0.0, 1.0E-8, (-31));
      Gamma.regularizedGammaP(Double.NaN, (-707.0), 1.7843463706590512E-7, 0);
      double double1 = (-555.23757298708);
      Gamma.regularizedGammaQ((-707.0), (-555.23757298708));
      try { 
        Gamma.regularizedGammaP(1.7843463706590512E-7, 1.7976931348623157E308, Double.NaN, (-31));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-31) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
