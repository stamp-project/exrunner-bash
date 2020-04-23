/*

 * Tue Apr 21 10:09:58 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
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
      brentSolver0.resetFunctionValueAccuracy();
      brentSolver0.setRelativeAccuracy(1371.03);
      brentSolver0.getFunctionValueAccuracy();
      brentSolver0.getFunctionValueAccuracy();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-15, 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      brentSolver0.solve(univariateRealFunction0, 1371.03, 2713.4427429917273);
      brentSolver0.setResult(5051.59, 2626);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction1 = quinticFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 1.0E-15, 1371.03);
  }
}
