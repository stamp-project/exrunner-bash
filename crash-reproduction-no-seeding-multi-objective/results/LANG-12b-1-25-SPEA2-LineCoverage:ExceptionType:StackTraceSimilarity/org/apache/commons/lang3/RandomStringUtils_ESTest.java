/*

 * Mon Apr 20 09:19:45 UTC 2020
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
      RandomStringUtils.randomNumeric(0);
      RandomStringUtils.random(0);
      int int1 = 2689;
      char[] charArray0 = new char[6];
      charArray0[0] = '[';
      charArray0[1] = 'J';
      charArray0[2] = '%';
      charArray0[3] = 'c';
      charArray0[4] = 'h';
      charArray0[5] = 'O';
      Random random0 = new Random(1L);
      // Undeclared exception!
      RandomStringUtils.random(2689, (-870), 2689, true, true, charArray0, random0);
  }
}
