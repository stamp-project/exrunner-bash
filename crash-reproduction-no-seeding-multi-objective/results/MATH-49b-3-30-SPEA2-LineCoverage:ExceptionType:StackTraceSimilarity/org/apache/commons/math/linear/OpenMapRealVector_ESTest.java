/*

 * Tue Apr 21 08:51:48 UTC 2020
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
      doubleArray0[0] = 3899.7601;
      doubleArray0[1] = 986.45296642873;
      doubleArray0[2] = 365.5;
      doubleArray0[3] = (-1418.42943821216);
      doubleArray0[4] = (-733.1332260623248);
      doubleArray0[5] = (-2531.272);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0, 0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.subtract(doubleArray0);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector2);
  }
}
