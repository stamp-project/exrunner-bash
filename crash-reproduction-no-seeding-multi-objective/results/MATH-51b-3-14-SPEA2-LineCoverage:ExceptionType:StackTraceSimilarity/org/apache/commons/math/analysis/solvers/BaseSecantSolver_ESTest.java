/*

 * Tue Apr 21 08:55:34 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.6799241637412468, (-1916.9736621835611), (-1916.9736621835611));
      int int0 = 0;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(quinticFunction0);
      monitoredFunction0.value(628.229965310174);
      monitoredFunction0.value((-1701.63));
      // Undeclared exception!
      pegasusSolver0.solve(39, (UnivariateRealFunction) monitoredFunction0, (-1701.63), 463.28882196);
  }
}
