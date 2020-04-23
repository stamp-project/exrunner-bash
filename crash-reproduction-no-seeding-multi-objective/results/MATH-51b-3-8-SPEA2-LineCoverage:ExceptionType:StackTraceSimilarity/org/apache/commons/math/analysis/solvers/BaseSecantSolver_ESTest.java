/*

 * Tue Apr 21 08:53:40 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      int int0 = 1500;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1500, 2513.5404812455);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.1430250008909141E-8, (-1473.02992139899));
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) sincFunction0, 0.5, 9.885278224973263, 1.1430250008909141E-8, allowedSolution0);
  }
}
