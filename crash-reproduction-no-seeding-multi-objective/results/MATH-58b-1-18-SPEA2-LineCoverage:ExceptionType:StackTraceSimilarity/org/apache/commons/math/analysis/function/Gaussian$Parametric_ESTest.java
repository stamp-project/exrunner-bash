/*

 * Tue Apr 21 09:23:31 UTC 2020
 */

package org.apache.commons.math.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.function.Gaussian;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Gaussian$Parametric_ESTest extends Gaussian$Parametric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      double double0 = (-6436.3514);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-6436.3514);
      doubleArray0[1] = (-6436.3514);
      double double1 = 0.0;
      double double2 = 3378.342708;
      // Undeclared exception!
      gaussian_Parametric0.value(3378.342708, doubleArray0);
  }
}
