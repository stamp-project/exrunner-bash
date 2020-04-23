/*

 * Tue Apr 21 08:44:25 UTC 2020
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1254);
      openMapRealVector0.getMinValue();
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAddToSelf(1254);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 1254;
      doubleArray0[1] = (double) 1254;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (double) 1254;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      OpenMapRealVector openMapRealVector2 = openMapRealVector1.copy();
      openMapRealVector0.set(0.0);
      // Undeclared exception!
      openMapRealVector2.ebeMultiply((RealVector) openMapRealVector1);
  }
}
