/*

 * Tue Apr 21 08:47:13 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-3549.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray1, doubleArray1);
      RealVector realVector0 = arrayRealVector0.combineToSelf((-3549.0), (-3549.0), doubleArray0);
      Double double0 = new Double(1.0E-12);
      Double[] doubleArray2 = new Double[6];
      doubleArray2[0] = double0;
      doubleArray2[1] = (Double) (-3549.0);
      doubleArray2[2] = (Double) (-3549.0);
      doubleArray2[3] = double0;
      doubleArray2[4] = double0;
      doubleArray2[5] = (Double) (-3549.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray2);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.mapSubtract((-2596.3946));
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
