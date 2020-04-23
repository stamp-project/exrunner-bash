/*

 * Tue Apr 21 08:40:06 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.solve(44, (UnivariateFunction) monitoredFunction0, (double) 44, 931.782344077803, allowedSolution0);
      UnivariateFunction univariateFunction1 = null;
      double double0 = (-1.0);
      bracketingNthOrderBrentSolver0.computeObjectiveValue(44);
      bracketingNthOrderBrentSolver0.doSolve();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.doSolve();
  }
}
