/*

 * Tue Apr 21 07:00:41 UTC 2020
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
      double double0 = (-487.962850469);
      double double1 = (-1361.8665003551);
      NumberUtils.min((-487.962850469), (-1361.8665003551), (-487.962850469));
      String string0 = "7[R}]%h3NdDL";
      // Undeclared exception!
      NumberUtils.createInteger("7[R}]%h3NdDL");
  }
}
