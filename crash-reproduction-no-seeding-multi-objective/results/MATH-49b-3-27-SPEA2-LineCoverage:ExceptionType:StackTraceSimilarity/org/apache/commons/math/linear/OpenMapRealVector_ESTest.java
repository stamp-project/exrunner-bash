/*

 * Tue Apr 21 08:51:16 UTC 2020
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
      double[] doubleArray0 = new double[8];
      Double[] doubleArray1 = new Double[9];
      Double double0 = new Double((-2081.0));
      doubleArray1[0] = double0;
      Double double1 = new Double((double) doubleArray1[0]);
      doubleArray1[1] = double1;
      Double double2 = new Double((double) doubleArray1[0]);
      doubleArray1[2] = double2;
      Double double3 = new Double(3767.4053589151704);
      doubleArray1[3] = double3;
      Double double4 = new Double(1.0E-12);
      doubleArray1[4] = double4;
      Double double5 = Double.valueOf((double) doubleArray1[2]);
      doubleArray1[5] = double5;
      Double double6 = new Double((-2081.0));
      doubleArray1[6] = double6;
      Double double7 = new Double((-1.0));
      doubleArray1[7] = double7;
      Double double8 = new Double((double) doubleArray1[7]);
      doubleArray1[8] = double8;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }
}
