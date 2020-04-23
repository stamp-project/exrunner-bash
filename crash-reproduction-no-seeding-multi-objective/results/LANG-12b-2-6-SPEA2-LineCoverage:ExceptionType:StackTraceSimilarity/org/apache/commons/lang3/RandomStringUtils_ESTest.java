/*

 * Mon Apr 20 09:19:22 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils.randomAlphabetic(0);
      int int1 = 388;
      RandomStringUtils.randomAlphabetic(388);
      RandomStringUtils.random(0);
      RandomStringUtils.random(0, 0, 388, true, false);
      // Undeclared exception!
      RandomStringUtils.random(388, "");
  }
}
