/*

 * Tue Apr 21 08:41:22 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
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
      double double0 = 2677.171272158988;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      int int0 = 2;
      double double1 = 2.771527181081452E-4;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction0 = quinticFunction0.derivative();
      double double2 = 0.30486756563186646;
      AllowedSolution allowedSolution1 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-1558.2299561814746), 2677.171272158988, 0.30486756563186646, allowedSolution1);
  }
}
