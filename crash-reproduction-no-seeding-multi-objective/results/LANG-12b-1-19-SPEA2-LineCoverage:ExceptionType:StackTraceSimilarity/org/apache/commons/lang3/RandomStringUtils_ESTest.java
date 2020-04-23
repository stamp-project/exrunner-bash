/*

 * Mon Apr 20 09:19:46 UTC 2020
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
      int int0 = 127;
      int int1 = (-1038);
      boolean boolean0 = true;
      boolean boolean1 = true;
      char[] charArray0 = new char[7];
      charArray0[0] = '\"';
      charArray0[1] = '?';
      charArray0[2] = '\"';
      charArray0[3] = '-';
      charArray0[4] = '+';
      charArray0[5] = '7';
      charArray0[6] = 'W';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn((-1032)).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(127, (-1038), 127, true, true, charArray0, random0);
  }
}
