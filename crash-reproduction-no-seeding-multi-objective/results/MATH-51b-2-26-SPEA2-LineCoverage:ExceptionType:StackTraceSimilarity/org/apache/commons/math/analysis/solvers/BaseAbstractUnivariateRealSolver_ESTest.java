/*

 * Tue Apr 21 08:59:47 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractUnivariateRealSolver_ESTest extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      MullerSolver mullerSolver0 = new MullerSolver();
      int int0 = 44;
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 610.1153903969;
      double double1 = 1174.1612932;
      doubleArray0[1] = 1174.1612932;
      doubleArray0[2] = 1.0E-6;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1.0E-6;
      doubleArray0[5] = (double) 44;
      try { 
        mullerSolver0.computeObjectiveValue(1174.1612932);
        fail("Expecting exception: TooManyEvaluationsException");
      
      } catch(TooManyEvaluationsException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver", e);
      }
  }
}
