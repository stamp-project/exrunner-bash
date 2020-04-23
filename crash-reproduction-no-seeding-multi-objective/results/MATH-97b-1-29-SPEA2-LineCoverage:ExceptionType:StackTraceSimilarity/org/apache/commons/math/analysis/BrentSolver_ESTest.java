/*

 * Tue Apr 21 10:35:36 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-601.82);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-601.82), (-601.82)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.resetMaximalIterationCount();
      brentSolver0.resetAbsoluteAccuracy();
      double double1 = (-1315.6332786923);
      double double2 = 2.0;
      // Undeclared exception!
      brentSolver0.solve(3.75, 2058.9213844265);
  }
}
