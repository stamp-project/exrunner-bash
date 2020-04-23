/*

 * Tue Apr 21 08:55:01 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 493.2896087948;
      double double1 = 0.95;
      double double2 = 0.0;
      BrentSolver brentSolver0 = new BrentSolver(493.2896087948, 0.95, 0.0);
      // Undeclared exception!
      brentSolver0.incrementEvaluationCount();
  }
}
