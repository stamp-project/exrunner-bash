/*

 * Tue Apr 21 08:55:03 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-2347.72111783811);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2347.72111783811), (-2347.72111783811), (-2347.72111783811));
      int int0 = 6112;
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      // Undeclared exception!
      regulaFalsiSolver0.solve(146, (UnivariateRealFunction) expm1Function0, (-2347.72111783811), 5628.7555590671, (-721.550740779));
  }
}
