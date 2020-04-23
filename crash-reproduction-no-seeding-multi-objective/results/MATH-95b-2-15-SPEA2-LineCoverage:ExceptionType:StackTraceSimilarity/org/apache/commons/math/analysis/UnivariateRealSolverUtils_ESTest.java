/*

 * Tue Apr 21 10:33:55 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class UnivariateRealSolverUtils_ESTest extends UnivariateRealSolverUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint((-1485.2123400146884), (-1485.2123400146884));
      SinFunction sinFunction0 = new SinFunction();
      double double0 = 0.0;
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-1485.2123400146884), 0.0, (-1485.2123400146884));
  }
}
