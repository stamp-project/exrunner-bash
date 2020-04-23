/*

 * Tue Apr 21 09:00:58 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2207.5585152), (-2207.5585152), (-3065.526049782241));
      SincFunction sincFunction0 = new SincFunction();
      double double0 = (-896.20993687851);
      double double1 = 3.036316375073511E-4;
      pegasusSolver0.isSequence(3.036316375073511E-4, 0.0, 1187.4645234782);
      double double2 = (-1205.5865895967);
      BaseSecantSolver.Method.values();
      // Undeclared exception!
      pegasusSolver0.solve(2, (UnivariateRealFunction) sincFunction0, (-1050.06), (double) 39143865, (-1205.5865895967));
  }
}
