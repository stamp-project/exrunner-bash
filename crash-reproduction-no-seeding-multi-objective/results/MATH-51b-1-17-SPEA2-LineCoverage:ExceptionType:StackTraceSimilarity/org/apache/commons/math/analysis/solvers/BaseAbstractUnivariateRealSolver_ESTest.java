/*

 * Tue Apr 21 08:57:11 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = 0.5;
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(914.61, 914.61, 2.4384203044354907E-8);
      Expm1Function expm1Function0 = new Expm1Function();
      RiddersSolver riddersSolver0 = new RiddersSolver(2.4384203044354907E-8, (-314));
      int int0 = (-3352);
      double double3 = (-25.3404285731303);
      expm1Function0.derivative();
      // Undeclared exception!
      riddersSolver0.solve((-3352), (UnivariateRealFunction) expm1Function0, 1.7976931348623157E308, (-25.3404285731303), 0.0);
  }
}
