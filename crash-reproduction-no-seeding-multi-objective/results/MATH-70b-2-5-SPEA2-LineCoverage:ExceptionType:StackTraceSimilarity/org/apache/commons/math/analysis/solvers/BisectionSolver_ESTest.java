/*

 * Mon Apr 20 11:58:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.isSequence(19.529122336534403, 0.0, 0.0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-820.412591829), (-820.412591829)).when(univariateRealFunction0).value(anyDouble());
      bisectionSolver0.isBracketing(19.529122336534403, 19.529122336534403, univariateRealFunction0);
      bisectionSolver0.setFunctionValueAccuracy(19.529122336534403);
      boolean boolean0 = bisectionSolver0.resultComputed;
      double double0 = 0.0;
      // Undeclared exception!
      bisectionSolver0.solve(0.0, 931.660654542);
  }
}
