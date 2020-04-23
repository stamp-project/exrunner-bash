/*

 * Tue Apr 21 06:17:46 UTC 2020
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
      StringUtils.chop("D5");
      StringUtils.containsNone("", "D");
      StringUtils.replaceOnce("D", "D5", "");
      StringUtils.isNumericSpace("D");
      StringUtils.indexOfDifference("D", "D5");
      String string0 = "LINUX";
      String[] stringArray0 = new String[5];
      stringArray0[0] = "D";
      stringArray0[1] = "D";
      stringArray0[2] = "D5";
      stringArray0[3] = "D5";
      // Undeclared exception!
      StringUtils.replaceEach("D5", stringArray0, stringArray0);
  }
}
