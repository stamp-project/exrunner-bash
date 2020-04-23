/*

 * Tue Apr 21 08:40:37 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-2150.7055661294585);
      int int0 = (-10);
      double double1 = 1085.22379543;
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double3 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double4 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double5 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SinFunction sinFunction0 = new SinFunction();
      UnivariateFunction univariateFunction0 = sinFunction0.derivative();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, univariateFunction0, (-2837.6), 1.0, 0.0);
  }
}
