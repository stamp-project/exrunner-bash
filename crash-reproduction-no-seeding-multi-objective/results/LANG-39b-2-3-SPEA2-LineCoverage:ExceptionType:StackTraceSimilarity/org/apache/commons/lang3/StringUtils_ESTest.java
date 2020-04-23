/*

 * Tue Apr 21 06:16:19 UTC 2020
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
      String string0 = null;
      int int0 = 904;
      StringUtils.abbreviate((String) null, 904);
      int int1 = 6283;
      String[] stringArray0 = new String[3];
      stringArray0[0] = null;
      stringArray0[1] = "7";
      stringArray0[2] = null;
      // Undeclared exception!
      StringUtils.replaceEach("7", stringArray0, stringArray0);
  }
}
