/*

 * Tue Apr 21 09:38:18 UTC 2020
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 3.14159265358979;
      doubleArray0[1] = 3.14159265358979;
      doubleArray0[2] = (-1001.5598005732304);
      doubleArray0[3] = 3.14159265358979;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-1001.5598005732304);
      doubleArray1[1] = (-1001.5598005732304);
      doubleArray1[2] = (-1001.5598005732304);
      // Undeclared exception!
      gaussian_Parametric0.value(3.14159265358979, doubleArray1);
  }
}
