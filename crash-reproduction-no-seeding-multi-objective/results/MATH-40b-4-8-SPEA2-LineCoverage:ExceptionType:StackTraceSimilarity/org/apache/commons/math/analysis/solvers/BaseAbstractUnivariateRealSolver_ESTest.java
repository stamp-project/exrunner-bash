/*

 * Tue Apr 21 08:39:53 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SincFunction;
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
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = (-1.157252059717014);
      int int0 = 4351;
      Expm1Function expm1Function0 = new Expm1Function();
      double double2 = (-1612.306087184);
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SincFunction sincFunction0 = new SincFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double4 = (-2303.8300968011617);
      double double5 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double6 = (-314.1444);
      double double7 = 1.6629734283189315E-8;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) expm1Function0, (-1612.306087184), 704.6629471419889);
  }
}
