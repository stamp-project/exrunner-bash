/*

 * Tue Apr 21 10:35:25 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-3303.02185914976);
      doubleArray0[1] = (-2586.3);
      doubleArray0[2] = 0.0;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      brentSolver0.verifyInterval((-2586.3), 429.778);
      brentSolver0.getRelativeAccuracy();
      brentSolver0.getAbsoluteAccuracy();
      brentSolver0.setMaximalIterationCount(0);
      brentSolver0.setMaximalIterationCount(0);
      // Undeclared exception!
      brentSolver0.solve((-2586.3), (double) 0);
  }
}
