/*

 * Tue Apr 21 08:41:54 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double((-550.3555489442258));
      doubleArray0[0] = double0;
      Double double1 = new Double((double) doubleArray0[0]);
      doubleArray0[1] = double1;
      double double2 = 0.5039018405998233;
      Double double3 = new Double(0.5039018405998233);
      doubleArray0[2] = double3;
      Double double4 = new Double(2051.0);
      doubleArray0[3] = double4;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.iterator();
      Object object0 = new Object();
      openMapRealVector0.equals(object0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      RealVector realVector0 = openMapRealVector0.mapDivide(1.8014398509481984E16);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
