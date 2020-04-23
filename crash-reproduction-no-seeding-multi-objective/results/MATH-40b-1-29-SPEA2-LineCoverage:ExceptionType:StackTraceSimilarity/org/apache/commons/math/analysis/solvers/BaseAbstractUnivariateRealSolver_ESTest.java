/*

 * Tue Apr 21 08:40:59 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, (-1621.8), 708.060651631078);
      LaguerreSolver laguerreSolver1 = new LaguerreSolver();
      // Undeclared exception!
      laguerreSolver1.incrementEvaluationCount();
  }
}
