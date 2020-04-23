/*

 * Tue Apr 21 08:53:10 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      double double0 = 3036.303242;
      int int0 = (-671);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(974.1235889, 0.0, 0.0);
      BaseSecantSolver.Method.values();
      illinoisSolver0.verifyInterval((-4035.071925645287), 0.0);
      int int1 = 2866;
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      double double1 = 2895.191911;
      // Undeclared exception!
      illinoisSolver0.solve(251, (UnivariateRealFunction) expm1Function0, (-4035.071925645287), 2347.475803, (double) (-671));
  }
}
