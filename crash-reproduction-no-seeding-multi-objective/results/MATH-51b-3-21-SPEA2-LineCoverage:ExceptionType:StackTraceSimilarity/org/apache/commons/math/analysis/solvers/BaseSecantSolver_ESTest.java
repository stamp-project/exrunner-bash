/*

 * Tue Apr 21 08:58:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(647.0820154079, (-2142.3), (-2142.3));
      Expm1Function expm1Function0 = new Expm1Function();
      Expm1Function expm1Function1 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(1463, (UnivariateRealFunction) expm1Function1, (-1874.381550247443), (double) 1463);
  }
}
