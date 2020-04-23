/*

 * Tue Apr 21 08:54:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double0 = Double.NEGATIVE_INFINITY;
      laguerreSolver0.getMaxEvaluations();
      double double1 = 0.0;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (double) (-1630);
      doubleArray0[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[3] = (double) (-1630);
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = Double.NEGATIVE_INFINITY;
      doubleArray0[6] = (-28.0288);
      doubleArray0[7] = (-1548.88);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      laguerreSolver0.setup((-1630), polynomialFunction0, (-567.989916630163), (-1630), (-1698.285629267667));
      try { 
        laguerreSolver0.computeObjectiveValue((-1548.88));
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (-1,630) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
