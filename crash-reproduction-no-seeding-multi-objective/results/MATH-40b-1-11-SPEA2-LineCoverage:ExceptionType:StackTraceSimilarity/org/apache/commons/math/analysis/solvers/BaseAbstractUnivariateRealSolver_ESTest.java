/*

 * Tue Apr 21 08:38:38 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2593.856599454;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2593.856599454, 2593.856599454, (-281.8648417237913));
      double double1 = 1.0;
      RiddersSolver riddersSolver0 = new RiddersSolver(3.99932613, 384.334697472763);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      riddersSolver0.solve((-551), (UnivariateFunction) expm1Function0, 1.0, 0.0, (-2140.102423));
  }
}
