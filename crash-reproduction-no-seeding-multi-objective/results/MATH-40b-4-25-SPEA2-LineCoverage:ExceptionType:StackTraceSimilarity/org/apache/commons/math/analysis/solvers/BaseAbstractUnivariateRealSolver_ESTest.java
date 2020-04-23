/*

 * Tue Apr 21 08:42:06 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 279;
      SinFunction sinFunction0 = new SinFunction();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double1 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      sinFunction0.derivative();
      SincFunction sincFunction1 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1515.8594320081907), 279);
      double double2 = 0.0;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(11, (UnivariateFunction) sincFunction1, (-1515.8594320081907), (-26.07887209391421), allowedSolution0);
  }
}
