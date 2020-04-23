/*

 * Tue Apr 21 08:52:09 UTC 2020
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
      doubleArray0[2] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 1314.8035);
      Double double0 = new Double(236.9);
      Double double1 = new Double(3882.3976506777517);
      Double double2 = new Double(631.143);
      Double double3 = new Double(0.1111111111111111);
      Double[] doubleArray1 = new Double[3];
      doubleArray1[0] = double3;
      doubleArray1[1] = double1;
      doubleArray1[2] = double1;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }
}
