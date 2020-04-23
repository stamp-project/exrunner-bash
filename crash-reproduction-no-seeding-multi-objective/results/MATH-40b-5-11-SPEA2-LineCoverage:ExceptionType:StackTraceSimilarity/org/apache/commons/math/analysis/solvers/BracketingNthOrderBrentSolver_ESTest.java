/*

 * Tue Apr 21 08:39:07 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
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
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 0.0625, 1153);
      bracketingNthOrderBrentSolver0.getStartValue();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getRelativeAccuracy();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction2 = quinticFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction2);
      QuinticFunction quinticFunction1 = new QuinticFunction();
      quinticFunction0.derivative();
      MonitoredFunction monitoredFunction1 = new MonitoredFunction(univariateFunction1);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) quinticFunction1, (-757.87053), (double) 2, 0.0625, allowedSolution0);
  }
}
