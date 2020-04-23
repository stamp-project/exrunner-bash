/*

 * Tue Apr 21 08:40:14 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3.382183422218077E-12, 5);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.value(384.6);
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 511.23535427539554, 3693.0557289777, 713.3641952728204, allowedSolution0);
  }
}
