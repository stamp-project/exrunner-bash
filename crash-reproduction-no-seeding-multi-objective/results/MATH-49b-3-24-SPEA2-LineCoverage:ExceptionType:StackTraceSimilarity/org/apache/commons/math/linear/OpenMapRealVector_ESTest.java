/*

 * Tue Apr 21 08:47:51 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1.0E-12;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      openMapRealVector0.getMaxValue();
      Double double0 = new Double(0.0);
      openMapRealVector1.getDistance(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray0, 0.0);
      OpenMapRealVector openMapRealVector3 = openMapRealVector2.ebeMultiply((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector4 = new OpenMapRealVector(doubleArray0);
      openMapRealVector3.getL1Norm();
      openMapRealVector0.mapSubtractToSelf((-1129.4));
      openMapRealVector0.getL1Norm();
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector4);
  }
}
