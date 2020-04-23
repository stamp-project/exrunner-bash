/*

 * Tue Apr 21 08:59:45 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BaseSecantSolver.Method.values();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0, 576);
      regulaFalsiSolver0.getMaxEvaluations();
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver(3.0, 3.0);
      regulaFalsiSolver1.getMaxEvaluations();
      // Undeclared exception!
      regulaFalsiSolver1.solve(10, (UnivariateRealFunction) quinticFunction0, (-274.06), (double) 576, 1.963469241472701E24);
  }
}
