/*

 * Tue Apr 21 08:39:38 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      bracketingNthOrderBrentSolver0.solve(1660, (UnivariateFunction) xMinus5Function0, (-1102.1645), 217.0, 0.5);
      bracketingNthOrderBrentSolver0.doSolve();
      xMinus5Function0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = (-954.0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) quinticFunction0, (-1232.405260191), (double) 3, (-954.0), allowedSolution0);
  }
}
