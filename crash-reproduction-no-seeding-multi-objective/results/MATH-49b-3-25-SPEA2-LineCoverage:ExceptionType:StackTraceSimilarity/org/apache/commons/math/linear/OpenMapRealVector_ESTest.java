/*

 * Tue Apr 21 08:48:03 UTC 2020
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-0.33333333333333287);
      doubleArray0[2] = 0.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.getDistance(openMapRealVector0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.33333333333333287), 0.0, 0.0, 2310.732766).when(univariateRealFunction0).value(anyDouble());
      RealVector realVector0 = openMapRealVector0.map(univariateRealFunction0);
      openMapRealVector0.ebeMultiply(realVector0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.copy();
      RealVector realVector1 = openMapRealVector1.mapDivide(44.5788562614);
      openMapRealVector1.checkVectorDimensions(realVector1);
      openMapRealVector0.equals(openMapRealVector1);
      OpenMapRealVector openMapRealVector2 = (OpenMapRealVector)openMapRealVector1.mapSubtractToSelf(1.0);
      openMapRealVector2.cosine(doubleArray0);
      OpenMapRealVector openMapRealVector3 = new OpenMapRealVector(18, 1.0);
      OpenMapRealVector openMapRealVector4 = new OpenMapRealVector(openMapRealVector2);
      // Undeclared exception!
      openMapRealVector4.ebeMultiply((RealVector) openMapRealVector0);
  }
}
