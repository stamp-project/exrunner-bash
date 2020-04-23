/*

 * Mon Apr 20 11:58:37 UTC 2020
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
      int int0 = 1;
      bisectionSolver0.setMaximalIterationCount(1);
      bisectionSolver0.getIterationCount();
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      double double0 = (-2547.39423547);
      double double1 = (-1741.1253555849);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(26.3959305378, (-1741.1253555849)).when(univariateRealFunction0).value(anyDouble());
      bisectionSolver1.isBracketing(1, (-2547.39423547), univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), (double) 0);
  }
}
