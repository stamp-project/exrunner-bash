/*

 * Mon Apr 20 09:20:42 UTC 2020
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
      RandomStringUtils.random(0);
      int int1 = 0;
      RandomStringUtils.randomAlphabetic(0);
      int int2 = 3559;
      char[] charArray0 = new char[4];
      charArray0[0] = '\\';
      charArray0[1] = '7';
      charArray0[2] = 'c';
      charArray0[3] = 'h';
      RandomStringUtils.random(3559, charArray0);
      RandomStringUtils.randomAscii(0);
      // Undeclared exception!
      RandomStringUtils.random(3559, "");
  }
}
