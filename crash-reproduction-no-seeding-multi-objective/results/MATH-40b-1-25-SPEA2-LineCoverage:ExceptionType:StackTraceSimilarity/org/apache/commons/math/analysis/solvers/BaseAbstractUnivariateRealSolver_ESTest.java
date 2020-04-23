/*

 * Tue Apr 21 08:40:31 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      NewtonSolver newtonSolver0 = new NewtonSolver();
      double double0 = 0.0;
      BisectionSolver bisectionSolver0 = new BisectionSolver(764.1276949717543, 764.1276949717543);
      double double1 = (-2114.906678393038);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2631.61));
      LaguerreSolver laguerreSolver1 = new LaguerreSolver(3060.09, 0.0, 329.25111386);
      // Undeclared exception!
      laguerreSolver1.incrementEvaluationCount();
  }
}
