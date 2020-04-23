/*

 * Tue Apr 21 06:17:07 UTC 2020
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
      int int0 = 4;
      StringUtils.abbreviate("The stripAccents(String) method is not supported until Java 1.6", 4);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "The stripAccents(String) method is not supported until Java 1.6";
      stringArray0[1] = "T...";
      stringArray0[3] = "T...";
      stringArray0[4] = "The stripAccents(String) method is not supported until Java 1.6";
      // Undeclared exception!
      StringUtils.replaceEach("The stripAccents(String) method is not supported until Java 1.6", stringArray0, stringArray0);
  }
}
