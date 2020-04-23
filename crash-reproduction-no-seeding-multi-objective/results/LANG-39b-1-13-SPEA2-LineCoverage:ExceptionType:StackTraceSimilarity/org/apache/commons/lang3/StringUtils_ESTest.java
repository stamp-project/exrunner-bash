/*

 * Tue Apr 21 06:17:00 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.indexOf("Iv9L", "Iv9L", (-1680));
      StringUtils.startsWithIgnoreCase("Iv9L", (String) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Minimum abbreviation width with offset is 7";
      stringArray0[1] = null;
      stringArray0[2] = "Iv9L";
      stringArray0[3] = null;
      stringArray0[4] = "Iv9L";
      stringArray0[5] = null;
      stringArray0[6] = "Iv9L";
      stringArray0[7] = "Iv9L";
      // Undeclared exception!
      StringUtils.replaceEach("Iv9L", stringArray0, stringArray0);
  }
}
