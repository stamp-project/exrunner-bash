/*

 * Tue Apr 21 08:58:44 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
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
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver(2426.0, 1635.0980354, (-251.5776051256745));
      int int0 = (-251);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      xMinus5Function0.derivative();
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) expm1Function0, (-4.503599627370496E15), 1635.0980354, (double) (-251), allowedSolution0);
  }
}
