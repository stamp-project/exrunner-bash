/*

 * Tue Apr 21 08:54:19 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-0.770597551);
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      sinFunction0.value((-0.770597551));
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-2126.157994193623), (-0.770597551));
      mullerSolver2_0.setup(0, sinFunction0, 1.2362392686983616, 0.0, (-0.770597551));
      mullerSolver2_0.getEvaluations();
      mullerSolver2_0.setup(0, sinFunction0, 851.1722320224586, (-0.770597551), 1.0);
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      double double2 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver(0);
      // Undeclared exception!
      riddersSolver0.doSolve();
  }
}
