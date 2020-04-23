/*

 * Tue Apr 21 08:52:29 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      double double0 = (-566.040263057);
      double double1 = 4055.0678;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2243.9595), (-2059.8513491), (-2059.8513491));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      regulaFalsiSolver0.solve(1820, (UnivariateRealFunction) expm1Function0, (-730.167767544), (double) 1820, (-1304.603890318923));
  }
}
