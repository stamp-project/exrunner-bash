/*

 * Tue Apr 21 08:42:33 UTC 2020
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(135, 2235);
      RealVector realVector0 = openMapRealVector0.mapDivideToSelf(2235);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 2235;
      doubleArray0[1] = (double) 135;
      doubleArray0[2] = (double) 135;
      doubleArray0[3] = (double) 2235;
      Double[] doubleArray1 = new Double[5];
      Double double0 = new Double(135.0);
      doubleArray1[0] = double0;
      Double double1 = new Double(135.0);
      doubleArray1[1] = double1;
      doubleArray1[2] = (Double) 2235.0;
      doubleArray1[3] = (Double) 135.0;
      doubleArray1[4] = (Double) 135.0;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(135);
      openMapRealVector0.setEntry(0, (-549.629768798647));
      openMapRealVector1.getMaxIndex();
      realVector0.setEntry(134, (-1442.0278791));
      openMapRealVector0.getMaxIndex();
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }
}
