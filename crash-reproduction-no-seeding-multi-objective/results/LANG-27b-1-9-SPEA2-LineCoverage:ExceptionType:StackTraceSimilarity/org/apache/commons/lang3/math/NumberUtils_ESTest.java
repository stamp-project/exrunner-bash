/*

 * Tue Apr 21 07:13:34 UTC 2020
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
      long long0 = 2646L;
      Long long1 = new Long(2646L);
      Long long2 = new Long((-1L));
      String string0 = "E.";
      NumberUtils.toInt("E.");
      NumberUtils.createNumber((String) null);
      NumberUtils.toInt((String) null);
      // Undeclared exception!
      NumberUtils.createNumber("@>elqSwrP/Q8aEt");
  }
}
