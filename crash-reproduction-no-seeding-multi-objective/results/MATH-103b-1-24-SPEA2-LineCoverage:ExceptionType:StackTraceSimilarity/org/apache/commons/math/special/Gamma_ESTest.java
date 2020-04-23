/*

 * Tue Apr 21 07:54:03 UTC 2020
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
      Gamma.regularizedGammaP(789.9, 789.9, (double) 10, 10);
      Gamma.logGamma(2304.7183);
      Gamma.regularizedGammaP(1.0E-14, 4.287203772479414E-8, 4624.96086, 12);
      Gamma.regularizedGammaP(1662.0, (-2380.32));
      Gamma.regularizedGammaQ(1.7976931348623157E308, 179.0, Double.NaN, 3182);
      Gamma.regularizedGammaQ((-785.4329016437), (-5360.5753436559235));
      Gamma.logGamma(2071.229764);
      Gamma.regularizedGammaQ(1666.0, 1.0E-8);
      try { 
        Gamma.regularizedGammaP(4.287203772479414E-8, 1.7976931348623157E308, 1.0E-8, 12);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (12) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
