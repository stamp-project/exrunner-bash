/*

 * Tue Apr 21 06:17:59 UTC 2020
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
      String string0 = "7'furzWvS|TlAmk(z";
      StringUtils.difference("7'furzWvS|TlAmk(z", "7'furzWvS|TlAmk(z");
      String[] stringArray0 = new String[5];
      stringArray0[1] = "7M/!v9H";
      stringArray0[2] = "";
      stringArray0[3] = "7M/!v9H";
      stringArray0[4] = "7M/!v9H";
      // Undeclared exception!
      StringUtils.replaceEach("7M/!v9H", stringArray0, stringArray0);
  }
}
