/*

 * Tue Apr 21 08:39:49 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BracketingNthOrderBrentSolver_ESTest extends BracketingNthOrderBrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-3118.173196103756);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3118.173196103756), (-3118.173196103756), (-3118.173196103756), 2621);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      SincFunction sincFunction0 = new SincFunction();
      double double1 = 1820.21;
      double double2 = 1460.00036313228;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(1085, (UnivariateFunction) sincFunction0, 0.02717219202551782, 1820.21, 1460.00036313228, allowedSolution0);
  }
}
