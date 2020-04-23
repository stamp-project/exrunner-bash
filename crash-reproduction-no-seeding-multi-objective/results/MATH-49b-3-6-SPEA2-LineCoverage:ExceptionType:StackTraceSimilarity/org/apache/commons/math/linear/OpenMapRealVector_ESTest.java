/*

 * Tue Apr 21 08:42:02 UTC 2020
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
      Double[] doubleArray0 = new Double[8];
      Double double0 = new Double((-0.16666666666666666));
      doubleArray0[3] = double0;
      double double1 = (-59.342290941);
      Double double2 = new Double((-59.342290941));
      doubleArray0[1] = double2;
      Double double3 = new Double(1.0);
      doubleArray0[2] = double3;
      Double double4 = new Double(20.853648);
      Double[] doubleArray1 = new Double[3];
      doubleArray1[0] = double0;
      doubleArray1[1] = double4;
      doubleArray1[2] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1, 1.0);
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-0.16666666666666666);
      doubleArray2[1] = 1.0;
      doubleArray2[2] = (-0.16666666666666666);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray2);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }
}
