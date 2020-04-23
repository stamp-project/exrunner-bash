/*

 * Mon Apr 20 11:59:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      bisectionSolver0.resetMaximalIterationCount();
      bisectionSolver0.resetFunctionValueAccuracy();
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      bisectionSolver0.getFunctionValueAccuracy();
      bisectionSolver0.resetRelativeAccuracy();
      bisectionSolver0.getIterationCount();
      Expm1Function expm1Function0 = new Expm1Function();
      double double0 = (-995.0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-995.0), 1.0, 1.0E-15);
  }
}
