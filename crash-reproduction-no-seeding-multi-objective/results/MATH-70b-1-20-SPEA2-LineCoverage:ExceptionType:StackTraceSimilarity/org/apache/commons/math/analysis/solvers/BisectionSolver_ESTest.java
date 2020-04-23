/*

 * Mon Apr 20 11:59:00 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      double double0 = 47.30406266;
      double double1 = 3.7811939250786963E-6;
      double double2 = (-964.67425897);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      BisectionSolver bisectionSolver1 = new BisectionSolver(quinticFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      double double3 = (-7.496321177960222E-13);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-7.496321177960222E-13), 47.30406266, 9.679856514768215E-4);
  }
}
