/*

 * Mon Apr 20 11:58:34 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BisectionSolver_ESTest extends BisectionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2.8421709430404007E-13;
      double double1 = 778.8983205888;
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double2 = 1916.882278605569;
      // Undeclared exception!
      bisectionSolver0.solve(658.518844588596, 1916.882278605569, 1916.882278605569);
  }
}
