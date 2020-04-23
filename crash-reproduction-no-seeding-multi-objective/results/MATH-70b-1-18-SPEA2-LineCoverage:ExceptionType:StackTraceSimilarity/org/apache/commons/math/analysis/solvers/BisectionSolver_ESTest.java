/*

 * Mon Apr 20 11:58:51 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      double double0 = 1916.649;
      bisectionSolver0.setResult(2048.610446562046, 1916.649, (-3414));
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      double double1 = 4680.904;
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction1 = expm1Function0.derivative();
      bisectionSolver1.solve(univariateRealFunction1, (double) (-3414), 4680.904);
      double double2 = 0.0;
      double double3 = (-1679.1135136979);
      double double4 = (-429.0009167);
      // Undeclared exception!
      bisectionSolver1.solve((UnivariateRealFunction) expm1Function0, (double) (-3414), 3429.349, (-1.0));
  }
}
