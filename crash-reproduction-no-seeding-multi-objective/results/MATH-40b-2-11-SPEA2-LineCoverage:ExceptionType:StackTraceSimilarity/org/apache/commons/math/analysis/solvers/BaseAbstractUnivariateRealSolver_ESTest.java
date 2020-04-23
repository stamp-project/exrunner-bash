/*

 * Tue Apr 21 08:38:41 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1356.8246549233;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(1238.851, (-1193.7), 1356.8246549233);
      double double1 = (-1576.5208234166466);
      double double2 = 0.0;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1193.7);
      doubleArray0[1] = 1.0E-14;
      doubleArray0[2] = 0.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      double double3 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      try { 
        laguerreSolver0.computeObjectiveValue(0.5);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
