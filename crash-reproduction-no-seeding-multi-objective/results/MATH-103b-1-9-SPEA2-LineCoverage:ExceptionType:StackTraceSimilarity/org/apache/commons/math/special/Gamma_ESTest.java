/*

 * Tue Apr 21 07:49:23 UTC 2020
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
      double double0 = 0.0;
      Gamma.regularizedGammaQ(0.0, 0.0);
      Gamma.regularizedGammaQ(0.0, 0.0);
      double double1 = 3411.97499828;
      int int0 = (-1);
      try { 
        Gamma.regularizedGammaP(3411.97499828, 2535.8955885, Double.NaN, (-1));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-1) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
