/*

 * Tue Apr 21 08:40:22 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
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
      int int0 = 1062;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-984.8948345939), 1057.3804325639408, (-0.50500515183), 1062);
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      SincFunction sincFunction1 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = (-1.0);
      bracketingNthOrderBrentSolver0.isSequence(1604, 1062, (-526.407449915));
      SincFunction sincFunction2 = new SincFunction();
      sincFunction2.derivative();
      AllowedSolution allowedSolution1 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(9, (UnivariateFunction) sincFunction2, (-3667.809150423772), Double.NaN, (-4.548078017326811E-31), allowedSolution0);
  }
}
