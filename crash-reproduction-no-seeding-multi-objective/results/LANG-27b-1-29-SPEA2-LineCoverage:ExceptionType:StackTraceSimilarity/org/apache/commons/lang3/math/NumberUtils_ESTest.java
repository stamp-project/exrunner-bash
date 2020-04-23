/*

 * Tue Apr 21 07:15:43 UTC 2020
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
      NumberUtils.max((-2253.5), (-2253.5), (-2253.5));
      NumberUtils.max(0.0F, 0.0F, 0.0F);
      Integer integer0 = NumberUtils.INTEGER_ONE;
      NumberUtils.max((double) 0.0F, (-6.012009794556935), 102.0);
      NumberUtils.max(0.0F, 0.0F, 0.0F);
      // Undeclared exception!
      NumberUtils.createNumber("Rf/PcSr'EDe");
  }
}
