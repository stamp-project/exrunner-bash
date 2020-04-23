/*

 * Tue Apr 21 08:38:40 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1164;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 1164);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(univariateFunction0).value(anyDouble());
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bracketingNthOrderBrentSolver0.setup(915, quinticFunction0, 0.0, 904.316753395, 0.6482070684432983);
      bracketingNthOrderBrentSolver0.solve(1164, univariateFunction0, 0.0);
      int int1 = (-1062);
      QuinticFunction quinticFunction1 = new QuinticFunction();
      int int2 = 4433;
      quinticFunction1.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) quinticFunction1, (-101.9117526), 2032.5, (double) 1164, allowedSolution0);
  }
}
