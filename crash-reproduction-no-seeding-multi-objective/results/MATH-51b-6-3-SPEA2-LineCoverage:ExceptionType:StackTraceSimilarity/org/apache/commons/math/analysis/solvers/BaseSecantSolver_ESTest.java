/*

 * Tue Apr 21 08:52:42 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      SincFunction sincFunction1 = new SincFunction();
      sincFunction1.derivative();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(84870);
      // Undeclared exception!
      regulaFalsiSolver0.solve(2, (UnivariateRealFunction) sincFunction1, 6.264394934563347E-4, 1373.9161171201658, 2505.456);
  }
}
