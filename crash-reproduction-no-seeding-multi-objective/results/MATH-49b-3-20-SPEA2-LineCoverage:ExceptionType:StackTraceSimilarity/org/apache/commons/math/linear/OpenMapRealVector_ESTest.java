/*

 * Tue Apr 21 08:47:17 UTC 2020
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
      Double double0 = new Double(1737.158);
      doubleArray0[0] = double0;
      Double double1 = new Double(1.0);
      doubleArray0[1] = double1;
      Double double2 = new Double(1737.158);
      doubleArray0[2] = double2;
      Double double3 = new Double((double) doubleArray0[1]);
      doubleArray0[3] = double3;
      Double double4 = new Double(1.0);
      doubleArray0[4] = double4;
      Double double5 = new Double((double) doubleArray0[1]);
      doubleArray0[5] = double5;
      Double double6 = new Double(3334.4387725);
      doubleArray0[6] = double6;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.14285714285714285);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
      openMapRealVector0.iterator();
      double[] doubleArray1 = new double[4];
      Double double7 = new Double(2216.93016307794);
      Double double8 = new Double(0.14285714285714285);
      Double double9 = new Double(2174.7918957);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray0, 3942.6512);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector2);
  }
}
