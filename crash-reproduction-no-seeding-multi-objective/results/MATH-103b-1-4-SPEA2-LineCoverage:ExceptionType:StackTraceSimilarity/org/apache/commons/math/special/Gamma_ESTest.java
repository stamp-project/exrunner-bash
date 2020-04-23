/*

 * Tue Apr 21 07:48:57 UTC 2020
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
      double double0 = (-2079.72);
      int int0 = (-500);
      Gamma.regularizedGammaP(1764.6869841954206, (-2079.72), 1764.6869841954206, (-500));
      double double1 = 0.0;
      int int1 = 7;
      Gamma.regularizedGammaQ(Double.NaN, 2450.33793, 0.0, 7);
      Gamma.regularizedGammaP((-220.6575956135), (-2079.72), 2450.33793, 7);
      Gamma.regularizedGammaQ(0.0, Double.NaN, Double.NaN, (-500));
      try { 
        Gamma.regularizedGammaP((double) 7, 1.0E-8, 431.992896, (-500));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-500) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
