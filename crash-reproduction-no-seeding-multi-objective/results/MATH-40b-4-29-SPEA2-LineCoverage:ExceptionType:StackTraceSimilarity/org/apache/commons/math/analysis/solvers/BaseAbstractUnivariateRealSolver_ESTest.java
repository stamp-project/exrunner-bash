/*

 * Tue Apr 21 08:41:31 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      SinFunction sinFunction0 = new SinFunction();
      quinticFunction0.derivative();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getEvaluations();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      double double1 = 0.0;
      double double2 = 2189.1;
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6);
      SinFunction sinFunction1 = new SinFunction();
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double4 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double[] doubleArray0 = new double[3];
      sinFunction1.value(922.5981);
      doubleArray0[0] = (double) 0;
      sinFunction1.derivative();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) sinFunction1, (-585.1734366716358), (double) 0, allowedSolution0);
  }
}
