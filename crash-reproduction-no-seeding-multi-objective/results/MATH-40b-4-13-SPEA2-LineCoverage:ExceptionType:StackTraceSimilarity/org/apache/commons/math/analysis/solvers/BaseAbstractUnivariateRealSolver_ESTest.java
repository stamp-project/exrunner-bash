/*

 * Tue Apr 21 08:39:22 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(555);
      double double0 = 0.0;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = 0.0;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3492), (-3492), (-882.7), 555);
      SinFunction sinFunction0 = new SinFunction();
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      bracketingNthOrderBrentSolver0.setup(0, sincFunction0, 1933, 2242.04501871, 0.0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(1307, (UnivariateFunction) sincFunction0, 523.9319, 1229.782, allowedSolution0);
  }
}
