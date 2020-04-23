/*

 * Tue Apr 21 08:59:28 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3052.0103));
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      PegasusSolver pegasusSolver1 = new PegasusSolver(1.0E-6);
      pegasusSolver1.verifyInterval((-1475.7681), 1.0E-6);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2, (UnivariateRealFunction) expm1Function0, (-3052.0103), (double) 2, (-1475.7681), allowedSolution0);
  }
}
