/*

 * Tue Apr 21 08:59:19 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-265.8145206);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      illinoisSolver0.solve(30, (UnivariateRealFunction) quinticFunction0, (double) 30, 1.0, (-29.34), allowedSolution0);
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) quinticFunction0, (-2158.462808519124), 0.1428571343421936);
  }
}
