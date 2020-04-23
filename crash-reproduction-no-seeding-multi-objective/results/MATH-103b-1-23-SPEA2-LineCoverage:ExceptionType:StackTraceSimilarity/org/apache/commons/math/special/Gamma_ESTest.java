/*

 * Tue Apr 21 07:53:53 UTC 2020
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
      double double0 = 697.33;
      int int0 = (-218);
      Gamma.regularizedGammaP((-1535.47122), (-1535.47122), 697.33, (-218));
      double double1 = 3.399464998481189E-5;
      try { 
        Gamma.regularizedGammaP(3.399464998481189E-5, 3.399464998481189E-5, (-1535.47122), 1392);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (1,392) exceeded
         //
         verifyException("org.apache.commons.math.special.Gamma", e);
      }
  }
}
