/*

 * Tue Apr 21 09:00:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
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
      int int0 = 3;
      int int1 = Integer.MAX_VALUE;
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      int int2 = 622371081;
      double double0 = 0.9999884259661137;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.9999884259661137);
      BaseSecantSolver.Method.values();
      BaseSecantSolver.Method.values();
      double double1 = 0.9999884259661137;
      double double2 = 1.0;
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction1 = sinFunction0.derivative();
      // Undeclared exception!
      pegasusSolver0.solve(4, univariateRealFunction1, (-9.9562599229), (-1.0));
  }
}
