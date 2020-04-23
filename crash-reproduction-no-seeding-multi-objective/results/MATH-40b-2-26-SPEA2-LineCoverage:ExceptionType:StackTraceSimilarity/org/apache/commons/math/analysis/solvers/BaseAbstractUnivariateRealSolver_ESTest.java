/*

 * Tue Apr 21 08:40:40 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1047.8438830646126);
      BisectionSolver bisectionSolver0 = new BisectionSolver(1047.8438830646126);
      double double0 = 0.95;
      sinFunction0.value(0.95);
      // Undeclared exception!
      bisectionSolver0.solve((-4294), (UnivariateFunction) sinFunction0, 0.0);
  }
}
