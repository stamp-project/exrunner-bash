/*

 * Tue Apr 21 08:41:24 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = (-726.1273);
      doubleArray0[0] = (-726.1273);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-2285.92289);
      doubleArray0[3] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1159325.03878578, 1.0E-12, (-2285.92289), 0.0, 1.6543921416530887E7).when(univariateRealFunction0).value(anyDouble());
      RealVector realVector0 = openMapRealVector0.mapToSelf(univariateRealFunction0);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
