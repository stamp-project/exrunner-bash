/*

 * Tue Apr 21 08:42:36 UTC 2020
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
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(0.0);
      doubleArray0[0] = double0;
      Double double1 = Double.valueOf((-1842.8));
      doubleArray0[1] = double1;
      Double double2 = new Double(0.0);
      Double.isFinite((double) doubleArray0[1]);
      doubleArray0[2] = double2;
      Double double3 = new Double((-317.9));
      doubleArray0[3] = double3;
      Double double4 = new Double((-1842.8));
      doubleArray0[4] = double4;
      Double double5 = new Double(4556.7120753);
      doubleArray0[5] = double5;
      Double double6 = new Double((double) doubleArray0[4]);
      doubleArray0[6] = double6;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 412.18057832);
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[5]);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }
}
