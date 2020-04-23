/*

 * Tue Apr 21 08:58:46 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      double double0 = 0.0;
      double double1 = 8.939758490158845E-5;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-649.0), 8.939758490158845E-5);
      int int0 = 34;
      Expm1Function expm1Function0 = new Expm1Function();
      double double2 = (-908.5);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(34, (UnivariateRealFunction) expm1Function0, (-649.0), (double) 34, (-908.5), allowedSolution0);
  }
}
