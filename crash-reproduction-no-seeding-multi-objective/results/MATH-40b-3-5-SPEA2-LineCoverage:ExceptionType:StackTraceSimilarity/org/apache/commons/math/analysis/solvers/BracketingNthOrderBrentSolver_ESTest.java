/*

 * Tue Apr 21 08:37:57 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double0 = (-0.0625);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.0625), (-0.0625), (double)5, 0.0).when(univariateFunction0).value(anyDouble());
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (double) 5);
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      int int0 = 4;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver1 = new BracketingNthOrderBrentSolver(5, 4);
      bracketingNthOrderBrentSolver0.getRelativeAccuracy();
      int int1 = 0;
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) sinFunction0, Double.NaN);
  }
}
