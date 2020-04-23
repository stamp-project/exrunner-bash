/*

 * Mon Apr 20 09:20:51 UTC 2020
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
      RandomStringUtils.randomAlphanumeric(1473);
      boolean boolean0 = false;
      char[] charArray0 = new char[7];
      charArray0[0] = '~';
      charArray0[1] = 'X';
      charArray0[2] = '0';
      charArray0[3] = 'x';
      charArray0[4] = '%';
      charArray0[5] = 'd';
      int int0 = 103;
      Random random0 = new Random();
      // Undeclared exception!
      RandomStringUtils.random(103, (-137), 56319, false, true, charArray0, random0);
  }
}
