/*

 * Tue Apr 21 08:48:31 UTC 2020
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1092, 1092);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapSubtract(1092);
      openMapRealVector0.mapSubtract(1399.2145438388636);
      openMapRealVector1.hashCode();
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }
}
