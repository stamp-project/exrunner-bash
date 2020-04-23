/*

 * Tue Apr 21 08:52:28 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 81.0653679167).when(univariateRealFunction0).value(anyDouble());
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = (-1181.045938);
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver();
      int int0 = (-592);
      SinFunction sinFunction1 = new SinFunction();
      sinFunction0.derivative();
      regulaFalsiSolver0.setup(113671, sinFunction0, 0.14756252594296226, (-2027.81535278522), 81.0653679167);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      regulaFalsiSolver1.solve(3071, univariateRealFunction0, (-2027.81535278522), (-1701.780320870135), (-3.822217831142452E13), allowedSolution0);
      // Undeclared exception!
      regulaFalsiSolver0.solve(36, (UnivariateRealFunction) sinFunction0, (-2027.81535278522), (-1.8866100215431922E-8), (double) (-592));
  }
}
