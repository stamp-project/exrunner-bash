/*

 * Tue Apr 21 08:53:39 UTC 2020
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
      int int0 = (-333);
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(50.32797, 160.626758);
      int int1 = 1059;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      regulaFalsiSolver0.solve(1059, univariateRealFunction0, (-2399.00252), (-0.8140501638901283), allowedSolution0);
      // Undeclared exception!
      regulaFalsiSolver0.solve(1059, (UnivariateRealFunction) expm1Function0, (-1.5707963267948966), 1228.635865965752, (double) 1059, allowedSolution0);
  }
}
