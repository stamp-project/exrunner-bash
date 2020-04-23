/*

 * Tue Apr 21 08:47:18 UTC 2020
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
      int int0 = 1731;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1731, 1731);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapSubtract(1731);
      OpenMapRealVector openMapRealVector2 = new OpenMapRealVector(1731);
      OpenMapRealVector openMapRealVector3 = openMapRealVector2.copy();
      Double double0 = new Double(1731);
      Double double1 = new Double(690.418334);
      Double[] doubleArray0 = new Double[1];
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector4 = openMapRealVector1.append(openMapRealVector1);
      openMapRealVector4.isDefaultValue(1.0);
      openMapRealVector1.getData();
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector3);
  }
}
