/*

 * Tue Apr 21 08:53:51 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
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
      double double0 = 1.1632884966735797;
      SincFunction sincFunction0 = new SincFunction();
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = (-204.93229737582843);
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-351));
      double double4 = (-2.356194490192345);
      double double5 = 0.0;
      double double6 = (-425.72);
      try { 
        laguerreSolver0.computeObjectiveValue(1472.26333329513);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
