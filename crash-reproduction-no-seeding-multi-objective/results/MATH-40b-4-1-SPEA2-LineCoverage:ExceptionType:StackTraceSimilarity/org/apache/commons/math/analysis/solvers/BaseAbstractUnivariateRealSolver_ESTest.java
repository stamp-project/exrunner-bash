/*

 * Tue Apr 21 08:37:42 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = (PolynomialFunction)polynomialFunction0.derivative();
      polynomialFunction0.toString();
      PolynomialFunction polynomialFunction2 = polynomialFunction0.subtract(polynomialFunction0);
      polynomialFunction0.negate();
      polynomialFunction2.derivative();
      double double0 = 0.0;
      polynomialFunction0.multiply(polynomialFunction1);
      polynomialFunction0.add(polynomialFunction2);
      polynomialFunction0.negate();
      double double1 = 0.0;
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.0);
      double double3 = (-3363.0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-17.373582363246804), 588, 588);
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(6, (UnivariateFunction) sincFunction0, (-3363.0), 0.0, allowedSolution0);
  }
}
