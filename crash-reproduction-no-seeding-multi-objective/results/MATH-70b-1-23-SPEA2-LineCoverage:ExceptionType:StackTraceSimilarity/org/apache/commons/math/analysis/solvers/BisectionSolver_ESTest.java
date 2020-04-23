/*

 * Mon Apr 20 11:59:08 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.derivative();
      double double0 = 0.0;
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      sinFunction0.derivative();
      double double1 = (-2833.389);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      quinticFunction0.derivative();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(0.0, 35.60495091003179);
  }
}
