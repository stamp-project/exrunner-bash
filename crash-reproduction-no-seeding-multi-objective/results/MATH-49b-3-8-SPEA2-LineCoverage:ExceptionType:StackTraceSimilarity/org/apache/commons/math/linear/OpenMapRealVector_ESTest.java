/*

 * Tue Apr 21 08:42:08 UTC 2020
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
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-3565.69);
      doubleArray0[3] = 1151.5205;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1.0E-12;
      doubleArray0[6] = 0.15;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.ebeDivide(doubleArray0);
      RealVector realVector0 = openMapRealVector0.mapMultiplyToSelf(1.0E-12);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply(realVector0);
  }
}
