/*

 * Mon Apr 20 11:58:44 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setRelativeAccuracy((-127.0));
      bisectionSolver0.setResult(510.8167847473, 3300);
      bisectionSolver0.checkResultComputed();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(quinticFunction0);
      BisectionSolver bisectionSolver1 = new BisectionSolver(monitoredFunction0);
      double double0 = 1329.9541601155;
      // Undeclared exception!
      bisectionSolver0.solve(510.8167847473, 1329.9541601155, 3.933906555175781E-4);
  }
}
