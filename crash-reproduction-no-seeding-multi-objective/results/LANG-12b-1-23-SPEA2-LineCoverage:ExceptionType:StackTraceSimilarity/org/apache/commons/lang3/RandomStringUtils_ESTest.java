/*

 * Mon Apr 20 09:20:18 UTC 2020
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
      RandomStringUtils.randomAlphanumeric(4349);
      char[] charArray0 = new char[3];
      charArray0[0] = '3';
      charArray0[1] = 'I';
      charArray0[2] = 'k';
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      doReturn(48).when(random0).nextInt(anyInt());
      // Undeclared exception!
      RandomStringUtils.random(1820, 0, 1895, false, false, charArray0, random0);
  }
}
