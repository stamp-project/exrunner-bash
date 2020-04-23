/*

 * Tue Apr 21 08:54:20 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1310.944255096917, (-2308.0), 1.0);
      int int0 = 1083;
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver(1310.944255096917);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(1083, (UnivariateRealFunction) expm1Function0, (-1914.77872496134), 1601010.5448395982, allowedSolution0);
  }
}
