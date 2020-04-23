/*

 * Tue Apr 21 07:54:16 UTC 2020
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
      double double0 = 1300.1851523635037;
      Gamma.logGamma(1300.1851523635037);
      int int0 = (-2817);
      try { 
        Gamma.regularizedGammaP(1300.1851523635037, 1300.1851523635037, 8019.816855896655, (-2817));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (-2,817) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
