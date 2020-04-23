/*

 * Tue Apr 21 08:56:57 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = (-2024.5679142);
      double double1 = 23.0;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      int int0 = 2;
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      double double2 = 1260.702271;
      // Undeclared exception!
      regulaFalsiSolver0.solve(2, univariateRealFunction0, (-1.0), 23.0, 1260.702271, allowedSolution0);
  }
}
