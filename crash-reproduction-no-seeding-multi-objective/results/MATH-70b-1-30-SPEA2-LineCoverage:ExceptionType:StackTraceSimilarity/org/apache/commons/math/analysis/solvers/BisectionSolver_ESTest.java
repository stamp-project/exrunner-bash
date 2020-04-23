/*

 * Mon Apr 20 11:59:27 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = 0.0;
      bisectionSolver0.setFunctionValueAccuracy(0.0);
      bisectionSolver0.setRelativeAccuracy(0.0);
      bisectionSolver0.setResult(0.0, 1.0E-15, 344);
      bisectionSolver0.resetFunctionValueAccuracy();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double1 = bisectionSolver0.functionValue;
      bisectionSolver0.getRelativeAccuracy();
      bisectionSolver0.setRelativeAccuracy(1.0E-15);
      bisectionSolver0.getFunctionValueAccuracy();
      double double2 = (-2663.19682767);
      // Undeclared exception!
      bisectionSolver0.solve(1.0E-6, (double) 344, (-2663.19682767));
  }
}
