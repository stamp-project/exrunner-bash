/*

 * Tue Apr 21 08:56:43 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 382.4199863543;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(382.4199863543, (-1067.068761), (-1067.068761));
      SincFunction sincFunction0 = new SincFunction();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2640.8498367));
      // Undeclared exception!
      pegasusSolver0.solve(2, (UnivariateRealFunction) sincFunction0, (-1808.291), (double) 2, 0.4342944622039795);
  }
}
