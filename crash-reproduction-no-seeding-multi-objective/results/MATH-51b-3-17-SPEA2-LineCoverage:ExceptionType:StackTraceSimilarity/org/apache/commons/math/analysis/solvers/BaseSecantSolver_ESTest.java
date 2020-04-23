/*

 * Tue Apr 21 08:57:12 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = 0.0;
      BaseSecantSolver.Method.values();
      sinFunction0.derivative();
      double double1 = 1421.71606;
      PegasusSolver pegasusSolver0 = new PegasusSolver(1421.71606, 0.0);
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      int int0 = 784063149;
      pegasusSolver0.solve(784063149, (UnivariateRealFunction) sinFunction0, 0.0, 1421.71606);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      String string0 = "qHXuq{P";
      BaseSecantSolver.Method baseSecantSolver_Method0 = BaseSecantSolver.Method.ILLINOIS;
      xMinus5Function0.derivative();
      int int1 = 149788368;
      double double2 = 1.0;
      double double3 = (-0.8414709848078965);
      // Undeclared exception!
      pegasusSolver0.solve(2, (UnivariateRealFunction) xMinus5Function0, (-0.8414709848078965), 2085.547661241, 0.0, allowedSolution0);
  }
}
