/*

 * Tue Apr 21 08:58:37 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 622.62202992416;
      int int0 = 1622;
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(326720.25, (-1817.32512), 0.4342944622039795);
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver1 = new PegasusSolver((-920.9466185113), 1622, (-2254.8248357));
      // Undeclared exception!
      pegasusSolver1.solve(639, (UnivariateRealFunction) expm1Function0, (-299.7338184313), 326720.25, 265.5109382, allowedSolution0);
  }
}
