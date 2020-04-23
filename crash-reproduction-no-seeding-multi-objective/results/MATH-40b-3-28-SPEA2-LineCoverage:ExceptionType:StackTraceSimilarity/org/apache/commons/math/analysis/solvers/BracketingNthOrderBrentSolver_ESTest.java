/*

 * Tue Apr 21 08:40:57 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 2);
      bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
      bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
      bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      UnivariateFunction univariateFunction0 = xMinus5Function0.derivative();
      bracketingNthOrderBrentSolver0.setup(2, univariateFunction0, 350.16728850000004, 1696.08, 0.0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 350.16728850000004);
  }
}
