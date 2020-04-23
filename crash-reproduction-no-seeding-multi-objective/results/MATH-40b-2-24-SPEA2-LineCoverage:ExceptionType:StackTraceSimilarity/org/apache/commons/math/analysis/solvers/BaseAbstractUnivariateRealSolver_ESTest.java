/*

 * Tue Apr 21 08:40:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 275.2156526104187;
      double double1 = 1016.4417904815;
      double double2 = 0.0;
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double4 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(1016.4417904815, 1.0E-6, 2.0369904934161003);
      double double5 = (-43.04777205269);
      try { 
        laguerreSolver0.computeObjectiveValue(1515.0810747);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
