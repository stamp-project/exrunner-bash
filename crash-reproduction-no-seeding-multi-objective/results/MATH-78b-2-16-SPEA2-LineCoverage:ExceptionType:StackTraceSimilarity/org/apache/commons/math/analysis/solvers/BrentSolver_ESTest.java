/*

 * Tue Apr 21 10:08:50 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      brentSolver0.clearResult();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 1660.42809731751).when(univariateRealFunction0).value(anyDouble());
      double double0 = (-1760.95202);
      brentSolver0.solve(univariateRealFunction0, (-1760.95202), 1.0E-14);
      brentSolver0.setAbsoluteAccuracy(1.0E-14);
      brentSolver0.getRelativeAccuracy();
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(879.3, 1660.42809731751).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1760.95202), 1.0E-14);
  }
}
