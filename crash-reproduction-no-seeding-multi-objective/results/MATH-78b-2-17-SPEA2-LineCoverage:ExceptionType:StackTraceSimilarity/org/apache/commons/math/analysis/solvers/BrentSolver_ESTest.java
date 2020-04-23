/*

 * Tue Apr 21 10:09:00 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BrentSolver_ESTest extends BrentSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2094.1181989123;
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      UnivariateRealFunction univariateRealFunction0 = null;
      double double1 = (-319.0);
      // Undeclared exception!
      brentSolver0.solve(0.5, 2094.1181989123);
  }
}
