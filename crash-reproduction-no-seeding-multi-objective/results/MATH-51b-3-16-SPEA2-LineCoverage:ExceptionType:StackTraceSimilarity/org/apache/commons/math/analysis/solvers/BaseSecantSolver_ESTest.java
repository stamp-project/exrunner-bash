/*

 * Tue Apr 21 08:57:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SincFunction;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      pegasusSolver0.isSequence((-7.443213455741653E-11), 791.7, (-7.443213455741653E-11));
      PegasusSolver pegasusSolver1 = new PegasusSolver((-100.41), 1.4456468917292502E-16);
      SincFunction sincFunction0 = new SincFunction();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      pegasusSolver1.solve(1694, (UnivariateRealFunction) sincFunction0, (-3886.76177371), 791.7, allowedSolution0);
      // Undeclared exception!
      pegasusSolver1.solve(835, (UnivariateRealFunction) expm1Function0, (-7.443213455741653E-11), (double) 1350, (double) (-1759));
  }
}
