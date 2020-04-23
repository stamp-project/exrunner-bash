/*

 * Tue Apr 21 08:40:38 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 21.52785114254759;
      NewtonSolver newtonSolver0 = new NewtonSolver();
      double double1 = 2.3705435424427623E169;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      double double2 = 0.03041595880308235;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      xMinus5Function0.derivative();
      xMinus5Function0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      newtonSolver0.solve((-1), (DifferentiableUnivariateFunction) xMinus5Function0, (-2161.8493089032), (-2161.8493089032));
  }
}
