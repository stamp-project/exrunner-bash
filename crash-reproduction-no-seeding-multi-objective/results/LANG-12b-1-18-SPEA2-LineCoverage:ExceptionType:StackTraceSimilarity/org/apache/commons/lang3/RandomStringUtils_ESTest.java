/*

 * Mon Apr 20 09:19:31 UTC 2020
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
      char[] charArray0 = new char[6];
      charArray0[0] = 'D';
      charArray0[1] = 'R';
      charArray0[2] = '\"';
      charArray0[3] = ' ';
      charArray0[4] = '5';
      charArray0[5] = 'A';
      Random random0 = new Random(1L);
      // Undeclared exception!
      RandomStringUtils.random(56319, 18, 699, false, true, charArray0, random0);
  }
}
