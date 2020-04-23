/*

 * Tue Apr 21 08:38:47 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-223);
      double double0 = 2.998466938482808;
      double double1 = 0.0;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double2 = (-1.0);
      SecantSolver secantSolver0 = new SecantSolver(0.0, (-1.0));
      secantSolver0.getEvaluations();
      // Undeclared exception!
      secantSolver0.doSolve();
  }
}
