/*

 * Tue Apr 21 08:57:40 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = 0.4794255386079491;
      IllinoisSolver illinoisSolver1 = new IllinoisSolver((-254.801847), (-1441.7498872825424), 1.0E-6);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      illinoisSolver1.solve(3, (UnivariateRealFunction) sincFunction0, (double) 3, 1551.3, (double) 1);
  }
}
