/*

 * Mon Apr 20 09:19:36 UTC 2020
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
      int int0 = 0;
      char[] charArray0 = new char[1];
      char char0 = 'c';
      charArray0[0] = 'c';
      Random random0 = new Random();
      RandomStringUtils.random(0, 0, 0, true, true, charArray0, random0);
      RandomStringUtils.random(0, true, false);
      int int1 = 1191;
      RandomStringUtils.random(0, 1191, 1191, false, false, charArray0);
      // Undeclared exception!
      RandomStringUtils.random(1191, "");
  }
}
