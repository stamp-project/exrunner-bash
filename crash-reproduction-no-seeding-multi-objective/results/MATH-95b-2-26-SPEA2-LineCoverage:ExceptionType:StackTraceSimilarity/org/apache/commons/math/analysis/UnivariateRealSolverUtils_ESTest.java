/*

 * Tue Apr 21 10:34:46 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-891.832), 2.0).when(univariateRealFunction0).value(anyDouble());
      double double0 = 1862.96003;
      double double1 = 1993.41656428;
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1862.96003, 1862.96003, 1993.41656428);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double2 = (-3392.989915);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction1, (-3392.989915), 1993.41656428, (-3392.989915));
  }
}
