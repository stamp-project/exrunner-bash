/*

 * Mon Apr 20 09:22:29 UTC 2020
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
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      char[] charArray0 = new char[4];
      charArray0[0] = '&';
      charArray0[1] = 'G';
      charArray0[2] = '5';
      charArray0[3] = '$';
      RandomStringUtils.random(799, charArray0);
      RandomStringUtils randomStringUtils1 = new RandomStringUtils();
      RandomStringUtils.random(799, true, false);
      RandomStringUtils.randomAlphabetic(799);
      RandomStringUtils.random(0);
      RandomStringUtils.random(0, false, false);
      RandomStringUtils.random(0, "Yh-Wf=E(%yM");
      RandomStringUtils.random(369, charArray0);
      RandomStringUtils.random(0);
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      RandomStringUtils.random(0, 0, 0, true, false, charArray0, random0);
      RandomStringUtils.random(0, charArray0);
      // Undeclared exception!
      RandomStringUtils.random(3601, "");
  }
}
