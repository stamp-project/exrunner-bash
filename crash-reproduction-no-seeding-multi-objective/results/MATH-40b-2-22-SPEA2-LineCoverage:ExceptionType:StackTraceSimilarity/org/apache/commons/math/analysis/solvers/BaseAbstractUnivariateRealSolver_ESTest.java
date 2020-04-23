/*

 * Tue Apr 21 08:40:06 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      double double1 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      double double2 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      int int0 = 0;
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      sinFunction0.derivative();
      sinFunction0.value(0.0);
      sinFunction0.derivative();
      sinFunction0.derivative();
      double double3 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      sinFunction0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateFunction0);
      double double4 = 0.0;
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.isSequence(1.0E-6, 1.0E-6, 1.3405498068733297);
      // Undeclared exception!
      secantSolver0.doSolve();
  }
}
