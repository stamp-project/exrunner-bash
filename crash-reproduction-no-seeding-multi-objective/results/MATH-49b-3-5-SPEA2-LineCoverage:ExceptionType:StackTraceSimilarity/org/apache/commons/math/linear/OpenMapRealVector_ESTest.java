/*

 * Tue Apr 21 08:41:48 UTC 2020
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
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-187.13009));
      double[] doubleArray1 = openMapRealVector0.getData();
      Double double0 = new Double(1.0E-12);
      RealVector realVector0 = openMapRealVector0.add(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(realVector0);
      Double[] doubleArray2 = new Double[9];
      doubleArray2[0] = (Double) (-1.0);
      doubleArray2[2] = (Double) (-1.0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray1);
      // Undeclared exception!
      openMapRealVector2.ebeMultiply((RealVector) openMapRealVector1);
  }
}
