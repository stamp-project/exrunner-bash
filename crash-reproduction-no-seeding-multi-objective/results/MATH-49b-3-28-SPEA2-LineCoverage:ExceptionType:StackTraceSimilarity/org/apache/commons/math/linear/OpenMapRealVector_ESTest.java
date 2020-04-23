/*

 * Tue Apr 21 08:51:29 UTC 2020
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
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 2164.880743677189;
      doubleArray0[2] = 2.85040095144011776E17;
      double double0 = 156.49;
      doubleArray0[3] = 156.49;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      RealVector realVector0 = openMapRealVector0.mapSubtractToSelf(1.0E-12);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply(realVector0);
  }
}
