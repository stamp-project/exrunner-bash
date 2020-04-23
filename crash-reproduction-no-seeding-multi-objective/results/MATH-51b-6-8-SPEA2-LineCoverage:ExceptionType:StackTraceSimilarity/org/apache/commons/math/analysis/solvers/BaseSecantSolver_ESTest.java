/*

 * Tue Apr 21 08:53:44 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      int int0 = 2504;
      SincFunction sincFunction0 = new SincFunction();
      pegasusSolver0.getEvaluations();
      sincFunction0.derivative();
      UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      pegasusSolver0.solve(2504, (UnivariateRealFunction) sincFunction0, (-2137.3863), 663.0000000370912, (-796.0), allowedSolution0);
      int int1 = (-2541);
      SinFunction sinFunction0 = new SinFunction();
      PegasusSolver pegasusSolver1 = new PegasusSolver((-2366.7));
      // Undeclared exception!
      pegasusSolver1.solve(3, univariateRealFunction0, 609.88, 2146.026, (-1365.22006268075));
  }
}
