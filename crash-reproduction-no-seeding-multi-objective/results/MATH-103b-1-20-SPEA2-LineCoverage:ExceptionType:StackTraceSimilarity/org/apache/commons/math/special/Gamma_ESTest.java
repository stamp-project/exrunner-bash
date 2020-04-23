/*

 * Tue Apr 21 07:51:27 UTC 2020
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
      double double0 = 57.15623566586292;
      int int0 = 2175;
      Gamma.regularizedGammaQ(57.15623566586292, 0.0, 0.0, 2175);
      int int1 = 0;
      try { 
        Gamma.regularizedGammaQ((double) 2175, 1.0, 0.0, 0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
