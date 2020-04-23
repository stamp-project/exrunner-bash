/*

 * Tue Apr 21 08:59:07 UTC 2020
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
      double double0 = 1.0E-6;
      PegasusSolver pegasusSolver0 = new PegasusSolver(8.0782, 1.0E-6, 8.0782);
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      expm1Function0.derivative();
      double double1 = (-2719.8373118173417);
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (-2719.8373118173417), 1944.607991, 150.0293280437);
  }
}
