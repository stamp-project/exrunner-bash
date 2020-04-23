/*

 * Tue Apr 21 06:17:53 UTC 2020
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
      StringUtils.indexOf("9RU&1", "9RU&1");
      StringUtils.leftPad("9RU&1", 0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "9RU&1";
      stringArray0[1] = "9RU&1";
      stringArray0[2] = "9RU&1";
      stringArray0[4] = "9RU&1";
      stringArray0[5] = "";
      // Undeclared exception!
      StringUtils.replaceEach("9RU&1", stringArray0, stringArray0);
  }
}
