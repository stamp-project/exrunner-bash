/*

 * Tue Apr 21 08:37:54 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2.6534494;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2.6534494, 2.6534494);
      double double1 = 4464.81145003;
      double double2 = 1.0E-15;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0E-15;
      doubleArray0[1] = (double) (-1596);
      doubleArray0[2] = 2.6534494;
      doubleArray0[3] = 1.0E-15;
      doubleArray0[4] = 2.6534494;
      doubleArray0[5] = 4464.81145003;
      doubleArray0[6] = (double) (-1596);
      doubleArray0[7] = (double) (-1596);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      laguerreSolver0.solve((-1596), polynomialFunction0, (-1596.0));
  }
}
