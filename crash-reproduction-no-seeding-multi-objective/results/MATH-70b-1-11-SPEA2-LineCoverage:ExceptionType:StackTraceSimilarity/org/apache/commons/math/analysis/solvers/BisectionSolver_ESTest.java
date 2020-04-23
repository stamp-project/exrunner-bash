/*

 * Mon Apr 20 11:58:24 UTC 2020
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
      double double0 = 9.92083689750249;
      double double1 = (-423.3881013219036);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.resetRelativeAccuracy();
      bisectionSolver0.resultComputed = false;
      // Undeclared exception!
      bisectionSolver0.solve((-423.3881013219036), 9.92083689750249);
  }
}
