/*

 * Tue Apr 21 08:58:52 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1621.240406639023));
      int int0 = (-464);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-4107.36103), 0.0, (-2002.22));
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      Expm1Function expm1Function1 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function1.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      RegulaFalsiSolver regulaFalsiSolver2 = new RegulaFalsiSolver((-4107.36103));
      // Undeclared exception!
      regulaFalsiSolver2.solve(2, (UnivariateRealFunction) expm1Function0, (-0.3058015757857271), 1970.5825943, 1.05175168892139E-16);
  }
}
