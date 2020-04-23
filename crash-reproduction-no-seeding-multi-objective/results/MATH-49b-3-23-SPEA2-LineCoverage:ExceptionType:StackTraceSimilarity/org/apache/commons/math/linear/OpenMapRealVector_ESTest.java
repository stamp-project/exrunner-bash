/*

 * Tue Apr 21 08:47:48 UTC 2020
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2209.0;
      Double[] doubleArray1 = new Double[2];
      doubleArray1[0] = (Double) 2209.0;
      doubleArray1[1] = (Double) 2209.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray1);
      openMapRealVector0.getMaxValue();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.subtract(openMapRealVector1);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector2);
  }
}
