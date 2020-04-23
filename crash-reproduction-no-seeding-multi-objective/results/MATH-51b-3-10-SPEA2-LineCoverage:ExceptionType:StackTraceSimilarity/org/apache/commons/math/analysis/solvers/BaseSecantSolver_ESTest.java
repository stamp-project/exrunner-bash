/*

 * Tue Apr 21 08:54:12 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(976.6572214482447, (-1797.9604968757942), 612.0488963689);
      Expm1Function expm1Function1 = new Expm1Function();
      illinoisSolver0.solve(5, (UnivariateRealFunction) expm1Function1, 0.0, 3.814697265625E-6, (-3953.57073916041), allowedSolution0);
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      double double0 = (-1947.38092297);
      AllowedSolution allowedSolution1 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(15, (UnivariateRealFunction) expm1Function1, (-1947.38092297), 1302.0, allowedSolution1);
  }
}
