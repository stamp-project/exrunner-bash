/*

 * Tue Apr 21 08:39:11 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = 49.25415014038257;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(49.25415014038257, 49.25415014038257);
      laguerreSolver0.getEvaluations();
      laguerreSolver0.verifySequence(0.0, 1.0E-12, 516.4656673456852);
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      // Undeclared exception!
      newtonSolver0.incrementEvaluationCount();
  }
}
