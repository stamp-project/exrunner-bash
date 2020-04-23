/*

 * Tue Apr 21 08:53:39 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 847.96;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(847.96);
      int int0 = 522;
      double double1 = 1911.549408684;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1911.549408684, (double)522, 1.0E-6, 0.0, (-2551.3)).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      regulaFalsiSolver0.solve(522, univariateRealFunction0, 1.0E-6);
  }
}
