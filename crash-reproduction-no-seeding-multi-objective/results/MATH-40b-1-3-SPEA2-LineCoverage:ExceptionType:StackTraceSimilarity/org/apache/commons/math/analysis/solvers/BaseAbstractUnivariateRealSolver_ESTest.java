/*

 * Tue Apr 21 08:37:38 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 14;
      Expm1Function expm1Function0 = new Expm1Function();
      SecantSolver secantSolver0 = new SecantSolver(2693.3711848418734, 649.754075);
      BrentSolver brentSolver0 = new BrentSolver(3190.8533050961246, 0.0);
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = (-1573.63967);
      NewtonSolver newtonSolver0 = new NewtonSolver((-1573.63967));
      // Undeclared exception!
      newtonSolver0.incrementEvaluationCount();
  }
}
