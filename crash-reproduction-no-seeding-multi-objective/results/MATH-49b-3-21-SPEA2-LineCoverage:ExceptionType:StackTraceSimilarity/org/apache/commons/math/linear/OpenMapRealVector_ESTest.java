/*

 * Tue Apr 21 08:47:21 UTC 2020
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
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2202.7;
      doubleArray0[1] = 81.5731971;
      doubleArray0[2] = 1573.041235953;
      doubleArray0[3] = (-1.0);
      doubleArray0[4] = (-897.28464779);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 536.6359);
      openMapRealVector0.sparseIterator();
      openMapRealVector0.getLInfDistance(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.subtract(doubleArray0);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(407, 1710, 2297.9551);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }
}
