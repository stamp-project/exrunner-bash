/*

 * Tue Apr 21 08:53:10 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1094.0372164000657), (-1094.0372164000657));
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 1.0E-6);
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      double double1 = 8.573489531218717E13;
      SinFunction sinFunction1 = new SinFunction();
      // Undeclared exception!
      pegasusSolver0.solve(10, (UnivariateRealFunction) sinFunction1, 606.0, 8.573489531218717E13);
  }
}
