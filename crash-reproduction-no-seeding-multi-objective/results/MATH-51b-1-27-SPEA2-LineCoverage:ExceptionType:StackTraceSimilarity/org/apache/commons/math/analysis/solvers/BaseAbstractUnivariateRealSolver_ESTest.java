/*

 * Tue Apr 21 08:59:52 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.8108721500322336;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6, 1.0E-6);
      double double3 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.8108721500322336, 2129.27);
      // Undeclared exception!
      laguerreSolver0.incrementEvaluationCount();
  }
}
