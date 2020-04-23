/*

 * Tue Apr 21 07:48:44 UTC 2020
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
      Gamma.regularizedGammaP(3.4101979451591155E-8, 15.853382782946895, 4803.2489311, 9589644);
      Gamma.regularizedGammaP(15.853382782946895, (-1329.461449885), 4803.2489311, 0);
      Gamma.regularizedGammaQ(15.853382782946895, 0.0, 0.0, 0);
      Gamma.regularizedGammaQ((double) 9589644, (-1329.461449885), (-100.614476321554), (-549));
      try { 
        Gamma.regularizedGammaP(3.4101979451591155E-8, 781.7843683575339, 0.0, 0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (0) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
