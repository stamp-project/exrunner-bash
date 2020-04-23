/*

 * Tue Apr 21 08:40:53 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1417;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-226.606003811), 1417);
      double double0 = (-1.0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver((-1.0), (-226.606003811), (-1801.4), 1417);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new BracketingNthOrderBrentSolver((-226.606003811), (-226.606003811), 3);
      int int1 = 1;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)3, (-1.5723449006087263E-7), 1615.291124859).when(univariateFunction0).value(anyDouble());
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, (-226.606003811));
  }
}
