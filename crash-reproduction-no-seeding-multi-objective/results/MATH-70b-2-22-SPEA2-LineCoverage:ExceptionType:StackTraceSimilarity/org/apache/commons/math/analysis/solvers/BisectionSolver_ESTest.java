/*

 * Mon Apr 20 11:59:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setAbsoluteAccuracy(0.0);
      int int0 = 0;
      bisectionSolver0.setResult(0.0, (-2492.467738401225), 0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BisectionSolver bisectionSolver1 = new BisectionSolver(univariateRealFunction0);
      BisectionSolver bisectionSolver2 = new BisectionSolver();
      bisectionSolver2.getRelativeAccuracy();
      double double0 = 1.0E-6;
      bisectionSolver1.solve((-2492.467738401225), 1.0E-6);
      double double1 = 3503.7133046975;
      bisectionSolver1.solve((-2492.467738401225), 3503.7133046975);
      // Undeclared exception!
      bisectionSolver2.solve(0.0, 1.0E-14);
  }
}
