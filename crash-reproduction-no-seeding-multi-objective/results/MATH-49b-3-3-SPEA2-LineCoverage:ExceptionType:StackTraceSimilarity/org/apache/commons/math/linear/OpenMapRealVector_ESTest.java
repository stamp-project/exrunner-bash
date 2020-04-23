/*

 * Tue Apr 21 08:41:57 UTC 2020
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(16, 730, 730);
      openMapRealVector0.mapMultiplyToSelf(986.138);
      RealVector realVector0 = openMapRealVector0.mapMultiplyToSelf(16);
      realVector0.set(986.138);
      openMapRealVector0.getDimension();
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(1500, 730, (-2028.634592475887));
      openMapRealVector1.mapMultiplyToSelf(1.732050807568877);
      realVector0.mapMultiplyToSelf(0.0);
      openMapRealVector1.set(986.138);
      openMapRealVector0.getMinIndex();
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
