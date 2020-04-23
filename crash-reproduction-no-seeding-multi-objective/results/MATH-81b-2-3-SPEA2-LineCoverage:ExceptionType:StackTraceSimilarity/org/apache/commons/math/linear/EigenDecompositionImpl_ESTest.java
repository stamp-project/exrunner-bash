/*

 * Mon Apr 20 09:55:21 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1940.2226393452922);
      doubleArray0[1] = (-1940.2226393452922);
      doubleArray0[2] = 540.0;
      doubleArray0[3] = (-3036.567454655116);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1940.2226393452922);
      doubleArray1[1] = (-0.4161468365471424);
      doubleArray1[2] = (-1940.2226393452922);
      doubleArray1[3] = 1309.0;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1940.2226393452922));
  }
}
