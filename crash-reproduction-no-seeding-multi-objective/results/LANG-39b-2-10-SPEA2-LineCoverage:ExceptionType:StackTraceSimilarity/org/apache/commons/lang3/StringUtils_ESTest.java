/*

 * Tue Apr 21 06:16:52 UTC 2020
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
      String[] stringArray0 = new String[6];
      String string0 = "B6aT$(";
      stringArray0[0] = "B6aT$(";
      stringArray0[0] = null;
      stringArray0[4] = "^NBBh^7V";
      // Undeclared exception!
      StringUtils.replaceEach("^NBBh^7V", stringArray0, stringArray0);
  }
}
