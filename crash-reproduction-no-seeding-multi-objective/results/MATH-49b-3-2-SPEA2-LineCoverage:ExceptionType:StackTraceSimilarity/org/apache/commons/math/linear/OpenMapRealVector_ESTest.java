/*

 * Tue Apr 21 08:41:29 UTC 2020
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
      double double0 = 695.84911;
      Double double1 = new Double(695.84911);
      doubleArray0[0] = double1;
      Double double2 = new Double((double) doubleArray0[0]);
      doubleArray0[1] = double2;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (double) doubleArray0[1]);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }
}
