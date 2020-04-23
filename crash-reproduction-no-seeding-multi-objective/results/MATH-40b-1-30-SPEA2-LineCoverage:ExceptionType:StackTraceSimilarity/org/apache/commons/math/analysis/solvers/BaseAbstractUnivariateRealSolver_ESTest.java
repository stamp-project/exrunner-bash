/*

 * Tue Apr 21 08:41:08 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 16;
      SincFunction sincFunction0 = new SincFunction();
      NewtonSolver newtonSolver0 = new NewtonSolver();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      sincFunction0.derivative();
      double double0 = 1200.595797;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      sincFunction0.derivative();
      double double2 = 0.6173843107490397;
      sincFunction0.derivative();
      // Undeclared exception!
      newtonSolver0.incrementEvaluationCount();
  }
}
