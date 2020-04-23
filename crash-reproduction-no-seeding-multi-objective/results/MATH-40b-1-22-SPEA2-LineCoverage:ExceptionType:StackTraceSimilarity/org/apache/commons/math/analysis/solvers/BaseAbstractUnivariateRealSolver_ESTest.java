/*

 * Tue Apr 21 08:40:08 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-2408);
      SecantSolver secantSolver0 = new SecantSolver();
      double double0 = 2559.5827767609526;
      secantSolver0.getEvaluations();
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = 1.0;
      double double3 = (-2448.5816013195936);
      // Undeclared exception!
      secantSolver0.incrementEvaluationCount();
  }
}
