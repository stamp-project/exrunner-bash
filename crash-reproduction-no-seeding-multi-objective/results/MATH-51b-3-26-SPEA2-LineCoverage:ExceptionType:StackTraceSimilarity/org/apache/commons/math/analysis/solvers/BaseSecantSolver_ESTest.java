/*

 * Tue Apr 21 08:59:46 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
      xMinus5Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      regulaFalsiSolver0.solve(68081, (UnivariateRealFunction) xMinus5Function0, 1.0, (double) 68081, allowedSolution0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 1.0);
      double double0 = 1.0E-6;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      AllowedSolution allowedSolution1 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) expm1Function0, (-2390.78), 2385.4556528053, allowedSolution1);
  }
}
