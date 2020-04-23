/*

 * Tue Apr 21 08:41:31 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SincFunction sincFunction0 = new SincFunction();
      sinFunction0.derivative();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction1 = new SinFunction();
      int int0 = 256;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SinFunction sinFunction2 = new SinFunction();
      sinFunction1.derivative();
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      NewtonSolver newtonSolver0 = new NewtonSolver();
      double double3 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      double double4 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sinFunction1, 1.0, (double) 10, allowedSolution0);
  }
}
