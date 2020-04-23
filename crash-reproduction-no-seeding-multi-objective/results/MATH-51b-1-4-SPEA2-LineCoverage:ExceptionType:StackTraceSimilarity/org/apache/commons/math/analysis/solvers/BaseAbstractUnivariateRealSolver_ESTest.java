/*

 * Tue Apr 21 08:52:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-865.056);
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = (-1832.4130231687134);
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      riddersSolver0.doSolve();
  }
}
