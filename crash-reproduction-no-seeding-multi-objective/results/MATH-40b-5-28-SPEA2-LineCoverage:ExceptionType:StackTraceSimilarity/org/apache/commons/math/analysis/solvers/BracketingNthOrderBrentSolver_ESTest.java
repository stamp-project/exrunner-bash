/*

 * Tue Apr 21 08:41:24 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
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
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1837.5092777180212), 0.0, (-1837.5092777180212), 354);
      bracketingNthOrderBrentSolver0.getRelativeAccuracy();
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      double double0 = 1358.775314;
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.value((-1837.5092777180212));
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      int int0 = 1541;
      MonitoredFunction monitoredFunction1 = new MonitoredFunction(expm1Function0);
      monitoredFunction1.setCallsCount(296);
      int int1 = (-1170);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      AllowedSolution allowedSolution1 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(296, (UnivariateFunction) expm1Function0, (double) (-1170), 976.2, (double) 354, allowedSolution1);
  }
}
