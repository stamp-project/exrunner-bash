/*

 * Mon Apr 20 09:19:59 UTC 2020
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
      int int0 = 136;
      int int1 = (-2323);
      int int2 = 1;
      boolean boolean0 = true;
      char[] charArray0 = new char[9];
      charArray0[0] = ',';
      charArray0[1] = ' ';
      charArray0[2] = 'G';
      charArray0[3] = 'J';
      charArray0[4] = 'b';
      charArray0[5] = 'L';
      charArray0[6] = 'g';
      charArray0[7] = '/';
      charArray0[8] = '!';
      // Undeclared exception!
      RandomStringUtils.random(136, (-2323), 1, true, true, charArray0);
  }
}
