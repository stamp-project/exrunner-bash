/*

 * Mon Apr 20 09:19:17 UTC 2020
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
      RandomStringUtils.randomAscii(0);
      int int1 = (-504);
      boolean boolean0 = false;
      char[] charArray0 = new char[9];
      charArray0[0] = 'Z';
      charArray0[1] = 'G';
      charArray0[2] = 'F';
      charArray0[3] = '1';
      charArray0[4] = 'q';
      charArray0[5] = '0';
      charArray0[6] = '#';
      charArray0[7] = '\\';
      charArray0[8] = '#';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn((-504)).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(56192, 56192, (-504), false, false, charArray0, random0);
  }
}
