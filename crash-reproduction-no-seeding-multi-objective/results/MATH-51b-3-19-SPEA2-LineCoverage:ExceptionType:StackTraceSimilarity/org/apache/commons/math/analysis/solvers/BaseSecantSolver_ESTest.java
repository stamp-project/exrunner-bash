/*

 * Tue Apr 21 08:57:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseSecantSolver.Method.values();
      double double0 = (-9.39947772393701E-13);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-9.39947772393701E-13), (-2552.003299));
      double double1 = (-29.0);
      regulaFalsiSolver0.isSequence((-29.0), (-1.0), (-9.39947772393701E-13));
      double double2 = 1012.3029466066372;
      // Undeclared exception!
      regulaFalsiSolver0.solve(107, (UnivariateRealFunction) sinFunction0, (-465.3768761621), 1012.3029466066372, allowedSolution0);
  }
}
