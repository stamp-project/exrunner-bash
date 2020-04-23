/*

 * Tue Apr 21 08:38:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
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
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0625, 0.0625);
      double[] doubleArray0 = new double[3];
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      doubleArray0[1] = (double) 1693;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      polynomialFunction0.derivative();
      polynomialFunction0.derivative();
      PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction2 = new PolynomialFunction(doubleArray0);
      polynomialFunction2.value(83.30963805697908);
      polynomialFunction2.toString();
      polynomialFunction0.multiply(polynomialFunction2);
      polynomialFunction1.add(polynomialFunction0);
      polynomialFunction1.add(polynomialFunction0);
      polynomialFunction0.add(polynomialFunction1);
      BisectionSolver bisectionSolver0 = new BisectionSolver(1429.234842, 2478.16902);
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver();
      try { 
        secantSolver0.computeObjectiveValue(0.0625);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
