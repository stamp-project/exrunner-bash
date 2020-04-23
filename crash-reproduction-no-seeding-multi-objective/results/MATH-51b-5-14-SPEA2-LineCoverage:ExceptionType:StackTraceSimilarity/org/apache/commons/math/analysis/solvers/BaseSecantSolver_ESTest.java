/*

 * Tue Apr 21 08:55:57 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      regulaFalsiSolver0.getMin();
      double double0 = (-2780.7162542);
      // Undeclared exception!
      regulaFalsiSolver0.solve(1170, (UnivariateRealFunction) quinticFunction0, (-2780.7162542), (double) 1170, 1060.74);
  }
}
