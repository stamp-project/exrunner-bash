/*

 * Mon Apr 20 11:58:40 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      SinFunction sinFunction1 = new SinFunction();
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.setRelativeAccuracy((-1.0));
      bisectionSolver0.setMaximalIterationCount(1);
      // Undeclared exception!
      bisectionSolver0.solve((-1615.7), 1589.644546);
  }
}
