/*

 * Tue Apr 21 08:54:36 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
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
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      SincFunction sincFunction1 = new SincFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sincFunction0);
      double double0 = (-339.9779583);
      int int0 = 0;
      SinFunction sinFunction0 = new SinFunction();
      double double1 = 0.99;
      double double2 = (-1.0);
      // Undeclared exception!
      pegasusSolver0.solve(2, univariateRealFunction0, (-103.16389462211838), 0.99, (-1.0));
  }
}
