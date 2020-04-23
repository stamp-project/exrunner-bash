/*

 * Mon Apr 20 09:19:54 UTC 2020
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
      char[] charArray0 = new char[9];
      charArray0[0] = 'v';
      charArray0[1] = 'Z';
      charArray0[2] = '_';
      charArray0[3] = 'k';
      charArray0[4] = 'n';
      charArray0[5] = 'B';
      charArray0[6] = '+';
      charArray0[7] = '&';
      charArray0[8] = '?';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn(1946).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(350, 350, 0, false, false, charArray0, random0);
  }
}
