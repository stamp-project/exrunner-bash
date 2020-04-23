/*

 * Tue Apr 21 08:57:06 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-702.69), 0.0, 1439.0);
      pegasusSolver0.verifySequence((-0.5), 0.0, 1511.85181699905);
      pegasusSolver0.getMin();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      quinticFunction0.derivative();
      QuinticFunction quinticFunction1 = new QuinticFunction();
      quinticFunction0.derivative();
      QuinticFunction quinticFunction2 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      PegasusSolver pegasusSolver1 = new PegasusSolver((-1.0), (-1.0));
      // Undeclared exception!
      pegasusSolver1.solve(5, univariateRealFunction0, (-0.5), 1511.85181699905, (double) 0);
  }
}
