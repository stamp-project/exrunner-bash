/*

 * Tue Apr 21 10:09:50 UTC 2020
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver1 = new BrentSolver(univariateRealFunction1);
      brentSolver1.setRelativeAccuracy((-2044.24530918));
      UnivariateRealFunction univariateRealFunction2 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver2 = new BrentSolver(univariateRealFunction2);
      UnivariateRealFunction univariateRealFunction3 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5).when(univariateRealFunction3).value(anyDouble());
      // Undeclared exception!
      brentSolver1.solve(univariateRealFunction3, (-2044.24530918), 1.0);
  }
}
