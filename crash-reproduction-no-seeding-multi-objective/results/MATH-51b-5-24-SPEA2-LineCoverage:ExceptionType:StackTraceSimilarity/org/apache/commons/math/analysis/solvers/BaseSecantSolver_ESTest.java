/*

 * Tue Apr 21 08:59:21 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0, 0);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction1 = sinFunction0.derivative();
      BaseSecantSolver.Method baseSecantSolver_Method0 = BaseSecantSolver.Method.REGULA_FALSI;
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction1);
      double double1 = 0.11764700710773468;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(2, (UnivariateRealFunction) monitoredFunction0, (-317.0), 0.11764700710773468, (-317.0), allowedSolution0);
  }
}
