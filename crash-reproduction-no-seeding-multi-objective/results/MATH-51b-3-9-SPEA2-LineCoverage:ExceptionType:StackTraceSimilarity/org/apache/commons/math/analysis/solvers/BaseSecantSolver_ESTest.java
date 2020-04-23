/*

 * Tue Apr 21 08:53:50 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SincFunction sincFunction0 = new SincFunction();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) sinFunction0, (-2425.533725027131), (double) 133, (-0.010714690733195933));
  }
}
