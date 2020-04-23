/*

 * Tue Apr 21 08:42:52 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
      SincFunction sincFunction0 = new SincFunction();
      UnivariateFunction univariateFunction0 = sincFunction0.derivative();
      sincFunction0.derivative();
      SincFunction sincFunction1 = new SincFunction();
      sincFunction0.derivative();
      sincFunction0.derivative();
      sincFunction0.derivative();
      SecantSolver secantSolver0 = new SecantSolver();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      sincFunction1.derivative();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(7, univariateFunction0, 1.0E-6, 5057.741032130145, allowedSolution0);
  }
}
