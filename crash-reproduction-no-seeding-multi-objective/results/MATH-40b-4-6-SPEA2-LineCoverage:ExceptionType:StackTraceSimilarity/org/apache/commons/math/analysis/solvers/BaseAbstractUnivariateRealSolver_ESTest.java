/*

 * Tue Apr 21 08:40:33 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      SincFunction sincFunction0 = new SincFunction();
      int int0 = 291;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      SincFunction sincFunction1 = new SincFunction();
      quinticFunction0.derivative();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      QuinticFunction quinticFunction1 = new QuinticFunction();
      double[] doubleArray0 = new double[10];
      doubleArray0[6] = (-603.8791162608);
      double double1 = (-561.148);
      sincFunction0.derivative();
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(9.990351100568362E-10, 0.8333333333333334);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-566.86795023), 0.0, (-603.8791162608), 918);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(918, (UnivariateFunction) sincFunction0, 1631.86248652, 1.1373425785132867E221, allowedSolution0);
  }
}
