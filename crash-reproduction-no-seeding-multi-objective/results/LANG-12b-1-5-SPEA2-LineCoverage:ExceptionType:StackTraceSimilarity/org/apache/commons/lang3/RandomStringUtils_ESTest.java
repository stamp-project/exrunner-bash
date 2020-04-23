/*

 * Mon Apr 20 09:19:14 UTC 2020
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
      int int0 = 56192;
      int int1 = (-567);
      boolean boolean0 = true;
      boolean boolean1 = true;
      char[] charArray0 = new char[4];
      charArray0[0] = '7';
      charArray0[1] = 'y';
      charArray0[2] = '2';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn((-567)).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(56192, 56192, (-567), true, true, charArray0, random0);
  }
}
