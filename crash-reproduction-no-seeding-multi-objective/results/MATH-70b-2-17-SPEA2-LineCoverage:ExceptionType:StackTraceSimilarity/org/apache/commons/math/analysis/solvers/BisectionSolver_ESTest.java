/*

 * Mon Apr 20 11:58:47 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = 1.0;
      bisectionSolver0.setAbsoluteAccuracy(1.0);
      int int0 = 1917;
      bisectionSolver0.setResult((-1013.27294207), 1917);
      bisectionSolver0.resetAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve((-1013.27294207), 1.0);
  }
}
