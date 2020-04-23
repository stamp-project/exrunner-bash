/*

 * Tue Apr 21 08:56:46 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2188.6));
      double double0 = 533.0;
      BrentSolver brentSolver0 = new BrentSolver();
      SecantSolver secantSolver0 = new SecantSolver();
      int int0 = 455;
      SinFunction sinFunction0 = new SinFunction();
      double double1 = 451.064381639406;
      // Undeclared exception!
      secantSolver0.incrementEvaluationCount();
  }
}
