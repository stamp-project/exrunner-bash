/*

 * Tue Apr 21 08:38:49 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      NewtonSolver newtonSolver0 = new NewtonSolver();
      bracketingNthOrderBrentSolver0.isSequence((-931.5708621374165), 0, 0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      newtonSolver0.getEvaluations();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 485.41129, allowedSolution0);
  }
}
