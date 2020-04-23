/*

 * Tue Apr 21 06:18:06 UTC 2020
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
      StringUtils.isNumeric(" vs ");
      String[] stringArray0 = StringUtils.splitPreserveAllTokens(" vs ");
      StringUtils.isNotBlank(" vs ");
      String[] stringArray1 = new String[6];
      stringArray1[0] = " vs ";
      stringArray1[1] = null;
      stringArray1[2] = " vs ";
      stringArray1[3] = " vs ";
      stringArray1[4] = null;
      stringArray1[5] = null;
      String string0 = StringUtils.replaceEach((String) null, stringArray0, stringArray1);
      StringUtils.rightPad(" vs ", (-2861), string0);
      StringUtils.removeEnd(string0, "7Pg&b*Une^z");
      // Undeclared exception!
      StringUtils.replaceEach(" vs ", stringArray1, stringArray1);
  }
}
