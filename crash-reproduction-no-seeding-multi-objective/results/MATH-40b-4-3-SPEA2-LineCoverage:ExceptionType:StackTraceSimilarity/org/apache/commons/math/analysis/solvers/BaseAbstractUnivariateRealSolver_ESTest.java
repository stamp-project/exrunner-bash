/*

 * Tue Apr 21 08:38:09 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2;
      SincFunction sincFunction0 = new SincFunction();
      double double0 = 0.3153223395347595;
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      sincFunction0.derivative();
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SinFunction sinFunction0 = new SinFunction();
      sincFunction0.derivative();
      SinFunction sinFunction1 = new SinFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 1.0E-6, 1.0E-6, 2);
      double double3 = (-1752.271350979);
      double double4 = 528.68487476559;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) sinFunction0, (-1752.271350979), 528.68487476559);
  }
}
