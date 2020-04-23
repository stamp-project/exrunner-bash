/*

 * Tue Apr 21 08:38:45 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double0 = 731.2782314643885;
      int int0 = 2097;
      double double1 = (-7.330635250808021E64);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction1 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(quinticFunction1);
      quinticFunction1.derivative();
      Expm1Function expm1Function0 = new Expm1Function();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      expm1Function0.value(2.1064911705560668E176);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      bracketingNthOrderBrentSolver0.setup(2097, expm1Function0, 10.353, 10.353, (-19.076104131051657));
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(11, (UnivariateFunction) quinticFunction1, (-7.330635250808021E64), 3369.491032375907, (double) 2097, allowedSolution0);
  }
}
