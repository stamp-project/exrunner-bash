/*

 * Tue Apr 21 09:00:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-6, 1.0E-6);
      pegasusSolver0.verifyInterval(1.0E-6, 3865.71925);
      pegasusSolver0.getMin();
      PegasusSolver pegasusSolver1 = new PegasusSolver((-23.06233), (-3.0709499147802607E12), 1428.7423759221113);
      SincFunction sincFunction0 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      monitoredFunction0.setCallsCount(44);
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) monitoredFunction0, (-1854.5598), 22.5, 3865.71925);
  }
}
