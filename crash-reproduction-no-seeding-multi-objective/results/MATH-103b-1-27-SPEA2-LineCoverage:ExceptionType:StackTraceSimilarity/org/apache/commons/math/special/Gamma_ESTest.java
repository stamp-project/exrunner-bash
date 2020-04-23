/*

 * Tue Apr 21 07:54:14 UTC 2020
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
      Gamma.regularizedGammaQ(0.0, 0.0);
      Gamma.logGamma(0.0);
      Gamma.regularizedGammaP(Double.NaN, 0.0, 0.0, 628);
      Gamma.logGamma(0.0);
      Gamma.regularizedGammaP(904.298, Double.NaN, 0.0, 628);
      Gamma.regularizedGammaP((-1.0), 0.0);
      Gamma.regularizedGammaP(0.0, (-1620.4));
      Gamma.regularizedGammaP(Double.NaN, Double.NaN);
      Gamma.regularizedGammaQ(0.0, 0.0);
      try { 
        Gamma.regularizedGammaP(833.6165816395, 4.652362892704858E-5, (-1.0), (-1862));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-1,862) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
