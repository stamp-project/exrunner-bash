/*

 * Tue Apr 21 08:58:48 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      regulaFalsiSolver0.isSequence(0.0, 0.0, (-4855.96844));
      double double0 = 1.0E-6;
      RegulaFalsiSolver regulaFalsiSolver1 = new RegulaFalsiSolver(0.0, 0.0, (-1416.692629398241));
      SinFunction sinFunction0 = new SinFunction();
      regulaFalsiSolver1.solve(470, (UnivariateRealFunction) sinFunction0, 1.0E-6, 0.0, 549.55297);
      int int0 = 1845;
      regulaFalsiSolver1.setup((-164), sinFunction0, 0.03497311972807893, 50.966496614458, (-133.076386201742));
      int int1 = 151;
      // Undeclared exception!
      regulaFalsiSolver1.solve(151, (UnivariateRealFunction) sinFunction0, (-2431.461509797921), 1514.0135045014242, 0.0);
  }
}
