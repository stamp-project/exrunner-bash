/*

 * Tue Apr 21 08:55:53 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = 0.5;
      regulaFalsiSolver0.setup(213, xMinus5Function0, 0.0, 213, 1.1102230246251565E-16);
      // Undeclared exception!
      regulaFalsiSolver0.solve(213, (UnivariateRealFunction) expm1Function0, (-1.7182818284590453), (double) 213, (-3095.72545622234));
  }
}
