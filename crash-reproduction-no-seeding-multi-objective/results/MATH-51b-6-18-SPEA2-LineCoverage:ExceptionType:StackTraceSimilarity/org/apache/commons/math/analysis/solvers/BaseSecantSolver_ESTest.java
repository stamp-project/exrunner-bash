/*

 * Tue Apr 21 08:57:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BaseSecantSolver.Method.values();
      PegasusSolver pegasusSolver0 = new PegasusSolver((-455.588033), 1744.54626, (-4453.6590342717));
      BaseSecantSolver.Method.values();
      // Undeclared exception!
      pegasusSolver0.solve(1508, (UnivariateRealFunction) expm1Function0, (-2858.9584980042964), 735.3817633177108, (-4453.6590342717));
  }
}
