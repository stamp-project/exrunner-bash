/*

 * Tue Apr 21 08:39:28 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1487;
      int int1 = 1524;
      double double0 = (-103.54940261110643);
      RiddersSolver riddersSolver0 = new RiddersSolver();
      NewtonSolver newtonSolver0 = new NewtonSolver(1524);
      int int2 = (-865);
      // Undeclared exception!
      newtonSolver0.computeDerivativeObjectiveValue((-865));
  }
}
