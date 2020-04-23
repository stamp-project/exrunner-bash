/*

 * Tue Apr 21 08:46:49 UTC 2020
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
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double(2002.3028069102822);
      doubleArray0[0] = double0;
      Double double1 = new Double(2002.3028069102822);
      doubleArray0[1] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[0]);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(openMapRealVector0);
      openMapRealVector1.getLInfDistance((RealVector) openMapRealVector0);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
      OpenMapRealVector openMapRealVector3 = openMapRealVector2.unitVector();
      double[] doubleArray1 = new double[1];
      int int0 = 3236;
      // Undeclared exception!
      openMapRealVector3.ebeMultiply((RealVector) openMapRealVector1);
  }
}
