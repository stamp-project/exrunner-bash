/*

 * Tue Apr 21 08:47:35 UTC 2020
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-4080.8);
      doubleArray0[1] = (-4080.8);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-4080.8), 0.0, (-455.45)).when(univariateRealFunction0).value(anyDouble());
      RealVector realVector0 = openMapRealVector1.map(univariateRealFunction0);
      openMapRealVector1.append(doubleArray0);
      openMapRealVector1.getL1Distance((RealVector) openMapRealVector0);
      openMapRealVector1.getLInfDistance(doubleArray0);
      openMapRealVector1.unitize();
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
