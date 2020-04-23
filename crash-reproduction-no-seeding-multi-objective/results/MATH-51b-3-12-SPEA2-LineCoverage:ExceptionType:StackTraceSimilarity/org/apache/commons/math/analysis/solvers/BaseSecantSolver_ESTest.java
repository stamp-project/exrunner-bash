/*

 * Tue Apr 21 08:54:43 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
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
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      xMinus5Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      regulaFalsiSolver0.solve(5, (UnivariateRealFunction) xMinus5Function0, (double) (-140), (double) 5, allowedSolution0);
      SincFunction sincFunction0 = new SincFunction();
      PegasusSolver pegasusSolver0 = new PegasusSolver(149.454602001);
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.derivative();
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (-4972.0736162626345), 27.001723637931835, 1.0);
  }
}
