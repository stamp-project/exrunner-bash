/*

 * Tue Apr 21 09:00:50 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(338.705612210573, 20);
      MullerSolver mullerSolver0 = new MullerSolver(1.0E-6, 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      quinticFunction0.derivative();
      SincFunction sincFunction0 = new SincFunction();
      MullerSolver mullerSolver1 = new MullerSolver((-3896.3195962701));
      RiddersSolver riddersSolver0 = new RiddersSolver(338.705612210573);
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BisectionSolver bisectionSolver0 = new BisectionSolver((-2286.2537483));
      BisectionSolver bisectionSolver1 = new BisectionSolver(1.0E-14, 0.0);
      // Undeclared exception!
      bisectionSolver1.incrementEvaluationCount();
  }
}
