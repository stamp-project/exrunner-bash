/*

 * Tue Apr 21 08:40:14 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-529.9964396855243);
      NewtonSolver newtonSolver0 = new NewtonSolver((-529.9964396855243));
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-529.9964396855243), (-529.9964396855243));
      SinFunction sinFunction0 = new SinFunction();
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, (-3608.49488636), (-529.9964396855243), 28);
      sinFunction0.derivative();
      sinFunction0.value(Double.NaN);
      double double2 = 0.0;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(1437, univariateFunction0, (-382.6209399899), 0.0, allowedSolution0);
  }
}
