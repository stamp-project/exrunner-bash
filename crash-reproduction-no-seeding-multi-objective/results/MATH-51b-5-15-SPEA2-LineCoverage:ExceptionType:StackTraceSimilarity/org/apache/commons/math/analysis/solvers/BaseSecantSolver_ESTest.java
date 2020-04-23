/*

 * Tue Apr 21 08:56:56 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
      double double0 = 1241.02689814;
      int int0 = 0;
      int int1 = 1;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver();
      int int2 = 244;
      double double1 = 1241.02689814;
      int int3 = 0;
      double double2 = 0.0;
      QuinticFunction quinticFunction1 = new QuinticFunction();
      quinticFunction1.derivative();
      quinticFunction1.derivative();
      SinFunction sinFunction0 = new SinFunction();
      quinticFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(244, (UnivariateRealFunction) quinticFunction0, (-2790.263826161783), 2048.5148060902575, 4.5100265295679398E17, allowedSolution0);
  }
}
