/*

 * Mon Apr 20 09:20:10 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      int int1 = 602;
      boolean boolean0 = false;
      char[] charArray0 = new char[0];
      int int2 = 1;
      RandomStringUtils.randomAlphanumeric(1);
      RandomStringUtils.randomAlphabetic(602);
      RandomStringUtils.randomAscii(602);
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils.randomAlphanumeric(0);
      boolean boolean1 = true;
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn((-1534)).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(360, 0, 1814, false, true, charArray0, random0);
  }
}
