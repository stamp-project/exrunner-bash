/*

 * Tue Apr 21 08:57:46 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = 16.74755901182417;
      Expm1Function expm1Function0 = new Expm1Function();
      Expm1Function expm1Function1 = new Expm1Function();
      expm1Function1.derivative();
      int int0 = 1240;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(17.36072917808019);
      // Undeclared exception!
      regulaFalsiSolver0.solve(1240, (UnivariateRealFunction) expm1Function0, (-2073.8), (double) 1240, (-2073.8), allowedSolution0);
  }
}
