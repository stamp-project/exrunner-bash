/*

 * Tue Apr 21 08:39:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      Expm1Function expm1Function0 = new Expm1Function();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = 1470.5;
      xMinus5Function0.derivative();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(Double.NaN, 287, 2);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (-1.0), 1470.5);
  }
}
