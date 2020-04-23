/*

 * Tue Apr 21 08:55:20 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3328.195), (-3328.195), (-3328.195));
      illinoisSolver0.getFunctionValueAccuracy();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1047.360503729286);
      SincFunction sincFunction1 = new SincFunction();
      sincFunction0.derivative();
      IllinoisSolver illinoisSolver1 = new IllinoisSolver((-1065.0), 2, (-3328.195));
      // Undeclared exception!
      illinoisSolver0.solve(2, univariateRealFunction0, (-3678.6904725), 0.8414709848078965, 0.0);
  }
}
