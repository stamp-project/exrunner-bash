/*

 * Tue Apr 21 07:13:56 UTC 2020
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
      NumberUtils numberUtils0 = new NumberUtils();
      long[] longArray0 = new long[6];
      longArray0[0] = (-1L);
      longArray0[1] = 678L;
      longArray0[2] = 108L;
      longArray0[3] = 424L;
      longArray0[4] = 1L;
      longArray0[5] = (-1L);
      NumberUtils.max(longArray0);
      long[] longArray1 = new long[5];
      longArray1[0] = (-40L);
      longArray1[1] = (-40L);
      longArray1[2] = (-1336L);
      longArray1[3] = 0L;
      longArray1[4] = (-2775L);
      NumberUtils.min(longArray1);
      NumberUtils.createNumber("0");
      // Undeclared exception!
      NumberUtils.createNumber("kPqbO)q}EOw0Z8e");
  }
}
