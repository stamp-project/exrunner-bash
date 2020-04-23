/*

 * Tue Apr 21 09:00:34 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = (-0.02906377077038888);
      // Undeclared exception!
      pegasusSolver0.solve(2, (UnivariateRealFunction) xMinus5Function0, 1.0E-6, (double) 2989, 1154.156916);
  }
}
