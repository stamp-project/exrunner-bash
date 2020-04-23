/*

 * Mon Apr 20 11:58:29 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      double double0 = 688.500102075806;
      // Undeclared exception!
      bisectionSolver1.solve((UnivariateRealFunction) sinFunction0, (-710.2315389301922), 688.500102075806, 0.25);
  }
}
