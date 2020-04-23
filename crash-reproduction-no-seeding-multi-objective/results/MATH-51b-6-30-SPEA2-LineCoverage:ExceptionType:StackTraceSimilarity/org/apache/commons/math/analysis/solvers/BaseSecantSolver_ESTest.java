/*

 * Tue Apr 21 09:01:08 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.520830426105009, 0.550313869040542, (-484.341));
      regulaFalsiSolver0.setup((-1835), sincFunction0, (-1835), 0.520830426105009, (-2.021226604924042E-27));
      // Undeclared exception!
      regulaFalsiSolver0.solve(334, (UnivariateRealFunction) quinticFunction0, 0.520830426105009, 621.351814, 1.0E-6);
  }
}
