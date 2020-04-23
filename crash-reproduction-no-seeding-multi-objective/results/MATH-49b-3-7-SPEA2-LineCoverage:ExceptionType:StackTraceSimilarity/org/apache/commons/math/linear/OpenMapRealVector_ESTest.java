/*

 * Tue Apr 21 08:42:06 UTC 2020
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
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2.356194490192345);
      doubleArray0[1] = 3632.0938190805;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 3632.0938190805);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      openMapRealVector0.getLInfNorm();
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      openMapRealVector2.ebeMultiply((RealVector) openMapRealVector1);
  }
}
