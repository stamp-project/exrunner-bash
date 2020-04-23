/*

 * Tue Apr 21 08:38:15 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.36926257844776833, (-0.0625));
      bisectionSolver0.getEvaluations();
      NewtonSolver newtonSolver0 = new NewtonSolver((-3042.0940590258497));
      double double0 = (-1673.8073247266);
      double double1 = 1.0E-15;
      SincFunction sincFunction0 = new SincFunction();
      double double2 = 66.6;
      // Undeclared exception!
      newtonSolver0.computeDerivativeObjectiveValue(66.6);
  }
}
