/*

 * Tue Apr 21 08:39:20 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-714.3071776446141);
      double double1 = (-1664.4089729894067);
      PegasusSolver pegasusSolver0 = new PegasusSolver(1405.981, (-714.3071776446141), (-1799.0));
      MullerSolver mullerSolver0 = new MullerSolver((-1664.4089729894067));
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double3 = 1745.4853511547;
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-714.3071776446141), 1.0E-6, 1405.981);
      double double4 = 0.0;
      double double5 = 0.0;
      double double6 = 0.0;
      double double7 = 1.0E-14;
      try { 
        laguerreSolver0.computeObjectiveValue(0.0);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
