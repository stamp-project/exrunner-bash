/*

 * Tue Apr 21 07:13:16 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = 3394.5503F;
      NumberUtils.min(floatArray0);
      // Undeclared exception!
      NumberUtils.createNumber("HcORZuc'7E(zg0Z:eC");
  }
}
