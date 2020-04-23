/*

 * Tue Apr 21 09:00:50 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 737.2191675822475;
      double double1 = (-718.098928528797);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-718.098928528797));
      int int0 = (-1507);
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      regulaFalsiSolver0.solve(28, univariateRealFunction0, (-718.098928528797), 4.048460736830904E100, (double) 1249);
  }
}
