/*

 * Tue Apr 21 08:39:42 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-0.74323902392252);
      SinFunction sinFunction0 = new SinFunction();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.61108235931), 0.0, 22);
      SinFunction sinFunction1 = new SinFunction();
      double double1 = (-3966.237810432158);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(22, (UnivariateFunction) quinticFunction0, (-3966.237810432158), (double) 22);
  }
}
