/*

 * Tue Apr 21 08:59:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.derivative();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2856.08574371251, (-1563));
      // Undeclared exception!
      illinoisSolver0.solve(259, (UnivariateRealFunction) expm1Function0, (-2.957007209750105E-8), 728.1866, (-2.356194490192345));
  }
}
