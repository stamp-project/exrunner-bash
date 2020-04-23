/*

 * Tue Apr 21 08:40:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      int int0 = 0;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = 1214.40147586;
      int int1 = (-271962964);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      xMinus5Function0.derivative();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMax();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(861, (UnivariateFunction) expm1Function0, (double) (-271962964), (double) 861, (-482.2184), allowedSolution0);
  }
}
