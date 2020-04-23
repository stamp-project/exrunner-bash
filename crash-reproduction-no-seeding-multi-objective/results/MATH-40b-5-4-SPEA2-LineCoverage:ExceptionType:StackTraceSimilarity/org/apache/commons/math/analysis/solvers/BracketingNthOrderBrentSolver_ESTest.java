/*

 * Tue Apr 21 08:38:24 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1188.883033512, 4512);
      bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver(1.0E-15, (-148.1951521016435), 2);
      bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver2 = new BracketingNthOrderBrentSolver((-3648.0), 1857);
      expm1Function0.derivative();
      // Undeclared exception!
      bracketingNthOrderBrentSolver2.solve(526, (UnivariateFunction) expm1Function0, (-3.7191402252101435E83), 3673.0338, 63.0, allowedSolution0);
  }
}
