/*

 * Tue Apr 21 10:35:10 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1.0E-15;
      doubleArray0[1] = 229.0;
      doubleArray0[2] = 2.25;
      doubleArray0[4] = (-4816.2);
      doubleArray0[5] = 1.0E-15;
      doubleArray0[6] = 2.25;
      doubleArray0[8] = (-2203.999433706003);
      PolynomialFunctionLagrangeForm.verifyInterpolationArray(doubleArray0, doubleArray0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunction0.value((-4247.192975686847));
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.defaultRelativeAccuracy = 1.0E-15;
      brentSolver0.setMaximalIterationCount(2);
      // Undeclared exception!
      brentSolver0.solve((-2293.25390446), (-143.46122));
  }
}
