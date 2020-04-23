/*

 * Mon Apr 20 09:19:25 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomStringUtils.randomAscii(272);
      RandomStringUtils.randomAlphabetic(272);
      char[] charArray0 = new char[4];
      charArray0[0] = '#';
      charArray0[1] = '6';
      charArray0[2] = '\'';
      Random random0 = new Random(0L);
      // Undeclared exception!
      RandomStringUtils.random(1, 1, 127, false, true, charArray0, random0);
  }
}
