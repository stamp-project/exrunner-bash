/*

 * Tue Apr 21 08:38:01 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-12.095653369064497);
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver((-1.0), 12);
      double double2 = (-1.0);
      riddersSolver0.verifyInterval((-12.095653369064497), (-1.0));
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      riddersSolver0.doSolve();
  }
}
