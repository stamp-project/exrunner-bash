/*

 * Tue Apr 21 08:38:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = (-272.390300315307);
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 400.067133785;
      doubleArray0[7] = 1.0E-6;
      doubleArray0[4] = 400.067133785;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      SecantSolver secantSolver0 = new SecantSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      secantSolver0.solve(0, (UnivariateFunction) sincFunction0, 400.067133785);
  }
}
