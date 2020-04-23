/*

 * Tue Apr 21 08:42:13 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.ArrayRealVector;
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
      doubleArray0[0] = 12.0;
      double double0 = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.1818181574344635;
      doubleArray0[3] = 260.9648841178209;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.1818181574344635);
      Double[] doubleArray1 = new Double[7];
      doubleArray1[0] = (Double) 0.1818181574344635;
      doubleArray1[1] = (Double) 260.9648841178209;
      doubleArray1[2] = (Double) 12.0;
      doubleArray1[3] = (Double) 12.0;
      doubleArray1[4] = (Double) 0.1818181574344635;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) arrayRealVector0);
  }
}
