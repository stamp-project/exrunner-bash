/*

 * Tue Apr 21 08:57:47 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 1103.179009279;
      double double2 = Double.NaN;
      double double3 = (-257.1601708844853);
      double double4 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-1423);
      doubleArray0[1] = (-257.1601708844853);
      doubleArray0[2] = (double) (-1423);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
      // Undeclared exception!
      secantSolver0.solve((-1423), univariateRealFunction0, (-1.0), (-98.52065462644559), Double.NaN);
  }
}
