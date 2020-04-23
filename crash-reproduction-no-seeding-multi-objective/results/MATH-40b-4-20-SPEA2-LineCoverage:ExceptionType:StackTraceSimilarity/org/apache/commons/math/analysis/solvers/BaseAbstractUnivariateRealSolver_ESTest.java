/*

 * Tue Apr 21 08:40:42 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
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
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      expm1Function0.derivative();
      expm1Function0.value(1.0E-6);
      expm1Function0.derivative();
      bracketingNthOrderBrentSolver0.isSequence(1.0E-6, 0.0, 0.0);
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      expm1Function0.derivative();
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-892.98), 360.377726724042);
  }
}
